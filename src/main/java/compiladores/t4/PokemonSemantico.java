package compiladores.t4;

import java.util.HashMap;
import java.util.Map;

import compiladores.t4.PokemonParser.AttackContext;
import compiladores.t4.PokemonParser.Declare_pokemonContext;
import compiladores.t4.PokemonParser.Declare_pokemon_attributeContext;
import compiladores.t4.PokemonParser.Declare_skillContext;
import compiladores.t4.PokemonParser.Declare_skill_attributeContext;
import compiladores.t4.PokemonParser.ProgramContext;
import compiladores.t4.PokemonTable.Pokemon;
import compiladores.t4.SkillTable.Skill;

public class PokemonSemantico extends PokemonBaseVisitor<Object> {

    SkillTable skills = new SkillTable();
    PokemonTable pokemons = new PokemonTable();
    //Error erro = new Error();
    
    @Override
    public Object visitProgram(ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Object visitDeclare_pokemon(Declare_pokemonContext ctx) {
        String name = null;
        Long hp = null;
        Long pp = null;
        HashMap<String, Integer> pokemonSkills = new HashMap<>();
        boolean emptySkillSet = true;
        ElementTypes.types type = null;

        for(Declare_pokemon_attributeContext attr : ctx.declare_pokemon_attribute()){
            if(attr.declare_name() != null){
                name = attr.declare_name().IDENT().getText().trim();                        
            }
            else if(attr.declare_hp() != null){
                hp = Long.parseLong(attr.declare_hp().NUM().getText());                    
            }
            else if(attr.declare_pp() != null){
                pp = Long.parseLong(attr.declare_pp().NUM().getText());
            }
            else if(attr.declare_skills() != null){
                for(int i = 0; i <  attr.declare_skills().IDENT().size(); i++){
                    emptySkillSet = false;
                    String skillName = attr.declare_skills().IDENT(i).getText().trim();
                    SkillTable.Skill skill = skills.getSkill(skillName);
                    if(skill == null){
                        SemanticoUtils.adicionarErroSemantico(attr.start, "Skill " + skillName + " not registered");
                    } else if(type != null && skill.type != type){
                        SemanticoUtils.adicionarErroSemantico(attr.start, "The pokemon type is incompatible with its skills");
                    }
                    else{
                        type = skill.type;
                        pokemonSkills.put(skillName, Integer.parseInt(attr.declare_skills().NUM(i).getText()));
                    } 
                }                    
            }
            else if(attr.declare_type() != null){
                ElementTypes.types typeAux = ElementTypes.getTypeFromString(attr.declare_type().TYPE().getText());
                if(type == null || type == typeAux){
                    type = typeAux;
                } else {
                    SemanticoUtils.adicionarErroSemantico(attr.start, "The pokemon type is incompatible with its skills");
                }              
            }
        }
        boolean error = false;
        if(name == null){
            SemanticoUtils.adicionarErroSemantico(ctx.start, "Empty Name on declaration");
            error = true;
        }
        if(hp == null){
            SemanticoUtils.adicionarErroSemantico(ctx.start, "Empty Health Points on declaration");
            error = true;
        }
        if(pp == null){
            SemanticoUtils.adicionarErroSemantico(ctx.start, "Empty Power Point on declaration");
            error = true;
        }
        if(emptySkillSet){
            SemanticoUtils.adicionarErroSemantico(ctx.start, "Empty Skillset on declaration");
            error = true;
        }
        if(type == null){
            SemanticoUtils.adicionarErroSemantico(ctx.start, "Empty Type on declaration");
            error = true;
        }
        if(!error){
            pokemons.insert(name, hp, pp, type, pokemonSkills);
        }
        
        return super.visitDeclare_pokemon(ctx);
    }
    
    @Override
    public Object visitDeclare_skill(Declare_skillContext ctx) {
        String name = null;
        Long damage = null;
        Long cost = null;
        ElementTypes.types type = null;
    
        for(Declare_skill_attributeContext attr : ctx.declare_skill_attribute()){
            if(attr.declare_name() != null){
                name = attr.declare_name().IDENT().getText().trim();                        
            }
            else if(attr.declare_damage() != null){
                damage = Long.parseLong(attr.declare_damage().NUM().getText());                    
            }
            else if(attr.declare_cost() != null){
                cost = Long.parseLong(attr.declare_cost().NUM().getText());
            }
            else if(attr.declare_type() != null){
                type = ElementTypes.getTypeFromString(attr.declare_type().TYPE().getText());                    
            }
        }
        boolean error = false;
        if(name == null){
            SemanticoUtils.adicionarErroSemantico(ctx.start,"Empty Name on declaration");
            error = true;
        }
        if(damage == null){
            SemanticoUtils.adicionarErroSemantico(ctx.start,"Empty Damage on declaration");
            error = true;
        }
        if(cost == null){
            SemanticoUtils.adicionarErroSemantico(ctx.start,"Empty Cost on declaration");
            error = true;
        }
        if(type == null){
            SemanticoUtils.adicionarErroSemantico(ctx.start,"Empty Type on declaration");
            error = true;
        }
        if(!error){
            skills.insert(name, cost, damage, type);
        }

        return super.visitDeclare_skill(ctx);
    }
    
    @Override
    public Object visitAttack(AttackContext ctx) {
        // TODO Auto-generated method stub
        String Ofensive = ctx.IDENT().get(0).getText().trim(), Skill = ctx.IDENT().get(1).getText().trim(), Defensive = ctx.IDENT().get(2).getText().trim();
        Pokemon Of = pokemons.getPokemon(Ofensive);
        Pokemon Df = pokemons.getPokemon(Defensive);
        if(Of == null)
            SemanticoUtils.adicionarErroSemantico(ctx.start, "The attacker does not exist");
        else{
            if(Of.skills.get(Skill) == null)
                SemanticoUtils.adicionarErroSemantico(ctx.start, Ofensive + " does not know how to use this skill");
        }
        if(Df == null)
            SemanticoUtils.adicionarErroSemantico(ctx.start, "The defender does not exist");
        else if (Of == Df)
            SemanticoUtils.adicionarErroSemantico(ctx.start, "An pokemon cannot attack itself");

        return super.visitAttack(ctx);
    }
}
