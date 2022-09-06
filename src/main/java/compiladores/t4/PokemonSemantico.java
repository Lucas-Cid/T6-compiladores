package compiladores.t4;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.TerminalNode;

import compiladores.t4.PokemonParser.AttackContext;
import compiladores.t4.PokemonParser.Declare_nameContext;
import compiladores.t4.PokemonParser.Declare_pokemonContext;
import compiladores.t4.PokemonParser.Declare_pokemon_attributeContext;
import compiladores.t4.PokemonParser.Declare_skillContext;
import compiladores.t4.PokemonParser.Declare_skill_attributeContext;
import compiladores.t4.PokemonParser.ProgramContext;
import compiladores.t4.SkillTable.Skill;
import compiladores.t4.ElementTypes;

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
        Integer hp = null;
        Integer pp = null;
        HashMap<String, Integer> pokemonSkills = new HashMap<>();
        ElementTypes.types type = null;

        for(Declare_pokemon_attributeContext attr : ctx.declare_pokemon_attribute()){
            if(attr.declare_name() != null){
                name = attr.declare_name().IDENT().getText();                        
            }
            else if(attr.declare_hp() != null){
                hp = Integer.parseInt(attr.declare_hp().NUM().getText());                    
            }
            else if(attr.declare_pp() != null){
                pp = Integer.parseInt(attr.declare_pp().NUM().getText());
            }
            else if(attr.declare_skills() != null){
                // TODO verificar se skill existe e se é do mesmo tipo do pokemon
                for(int i = 0; i <  attr.declare_skills().IDENT().size(); i++){
                    pokemonSkills.put(attr.declare_skills().IDENT().get(i).getText(), Integer.parseInt(attr.declare_skills().NUM().get(i).getText()));
                }                    
            }
            else if(attr.declare_type() != null){
                type = ElementTypes.getTypeFromString(attr.declare_type().getText());                    
            }
        }
        // if(name == null)
        //     erro.add("Empty Name on declaration");
        // if(hp == null)
        //     erro.add("Empty Health Points on declaration");
        // if(pp == null)
        //     erro.add("Empty Power Point on declaration");
        // if(skills.isEmpty())
        //     erro.add("Empty Skillset on declaration");
        // else
                // for(Map.Entry<String, Integer> entry : pokemonSkills.entrySet()){
                //     Skill s = skills.getSkill(entry.getKey());
                //     if(s == null){
                //         // erro.add("Skill " + entry.getKey() + " was not registered!");
                //         continue;
                //     }
                //     if(s.type != type);
                //         // erro.add("Skill " + entry.getKey() + " was not registered!");
                // }
        // if(type == null)
        //     erro.add("Empty Type on declaration");
        
        pokemons.insert(name, hp, pp, type, pokemonSkills);
        
        return super.visitDeclare_pokemon(ctx);
    }
    
    @Override
    public Object visitDeclare_skill(Declare_skillContext ctx) {
        String name = null;
        Integer damage = null;
        Integer cost = null;
        ElementTypes.types type = null;
    
        for(Declare_skill_attributeContext attr : ctx.declare_skill_attribute()){
            if(attr.declare_name() != null){
                name = attr.declare_name().IDENT().getText();                        
            }
            else if(attr.declare_damage() != null){
                damage = Integer.parseInt(attr.declare_damage().NUM().getText());                    
            }
            else if(attr.declare_cost() != null){
                cost = Integer.parseInt(attr.declare_cost().NUM().getText());
            }
            else if(attr.declare_type() != null){
                type = ElementTypes.getTypeFromString(attr.declare_type().getText());                    
            }
        }
        // if(name == null)
        //     erro.add("Empty Name on declaration");
        // if(damage == null)
        //     erro.add("Empty Damage on declaration");
        // if(cost == null)
        //     erro.add("Empty Cost on declaration");
        // if(type == null)
        //     erro.add("Empty Type on declaration");
        
        skills.insert(name, cost, damage, type);
        // TODO Auto-generated method stub
        return super.visitDeclare_skill(ctx);
    }
    
    @Override
    public Object visitAttack(AttackContext ctx) {
        // TODO Auto-generated method stub
        ctx.IDENT()
        return super.visitAttack(ctx);
    }
}
