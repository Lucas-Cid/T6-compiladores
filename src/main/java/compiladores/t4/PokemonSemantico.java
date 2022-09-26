package compiladores.t4;

import java.util.HashMap;

import compiladores.t4.PokemonParser.AttackContext;
import compiladores.t4.PokemonParser.Declare_pokemonContext;
import compiladores.t4.PokemonParser.Declare_pokemon_attributeContext;
import compiladores.t4.PokemonParser.Declare_skillContext;
import compiladores.t4.PokemonParser.Declare_skill_attributeContext;
import compiladores.t4.PokemonParser.ProgramContext;
import compiladores.t4.PokemonTable.Pokemon;

public class PokemonSemantico extends PokemonBaseVisitor<Object> {
    // Cria uma tabela de skills
    // Aqui serão colocadas todas as skills declaradas
    SkillTable skills = new SkillTable();

    // Cria uma tabela de pokemons
    // Aqui serão colocados todas os pokemons declarados
    PokemonTable pokemons = new PokemonTable();
    
    @Override
    public Object visitProgram(ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Object visitDeclare_pokemon(Declare_pokemonContext ctx) {
        // Inicialmente, declara todos os atributos necessários na criação de um pokemon
        String name = null;
        Long hp = null;
        Long pp = null;
        HashMap<String, Integer> pokemonSkills = new HashMap<>();
        boolean emptySkillSet = true;
        ElementTypes.types type = null;

        // Os atributos podem ser declarados em qualquer ordem, então é necessário percorrer
        // todos os atributos declarados e verificar qual é o tipo de cada um
        for(Declare_pokemon_attributeContext attr : ctx.declare_pokemon_attribute()){
            // Se o atributo for do tipo nome, então o valor do atributo é o nome do pokemon
            if(attr.declare_name() != null){
                name = attr.declare_name().IDENT().getText().trim();                        
            }
            // Se o atributo for do tipo hp, então o valor do atributo é o hp do pokemon
            else if(attr.declare_hp() != null){
                hp = Long.parseLong(attr.declare_hp().NUM().getText());                    
            }
            // Se o atributo for do tipo pp, então o valor do atributo é o pp do pokemon
            else if(attr.declare_pp() != null){
                pp = Long.parseLong(attr.declare_pp().NUM().getText());
            }
            // Se o atributo for do tipo skills, então o valor do atributo é uma lista de skills
            else if(attr.declare_skills() != null){
                // Se o pokemon tiver skills, então o conjunto de skills não está vazio
                for(int i = 0; i <  attr.declare_skills().IDENT().size(); i++){
                    emptySkillSet = false;
                    String skillName = attr.declare_skills().IDENT(i).getText().trim();

                    // Verifica se a skill existe na tabela de skills
                    SkillTable.Skill skill = skills.getSkill(skillName);

                    if(skill == null){
                        SemanticoUtils.adicionarErroSemantico(attr.start, "Skill " + skillName + " not registered");
                    } else if(type != null && skill.type != type){
                        // Se existir, é necessário verificar se todas são do mesmo tipo e do mesmo tipo do pokemon
                        SemanticoUtils.adicionarErroSemantico(attr.start, "The pokemon type is incompatible with its skills");
                    }
                    else{
                        // Se tudo estiver em ordem, basta adicionar as skils na lista do pokemon
                        type = skill.type;
                        pokemonSkills.put(skillName, Integer.parseInt(attr.declare_skills().NUM(i).getText()));
                    } 
                }                    
            }
            // Se o atributo for do tipo type, então o valor do atributo é um tipo
            else if(attr.declare_type() != null){
                // Se as skills já foram declaradas, então o tipo do pokemon deve ser do mesmo tipo das skills
                ElementTypes.types typeAux = ElementTypes.getTypeFromString(attr.declare_type().TYPE().getText());
                if(type == null || type == typeAux){
                    type = typeAux;
                } else {
                    SemanticoUtils.adicionarErroSemantico(attr.start, "The pokemon type is incompatible with its skills");
                }              
            }
        }
        // Verifica se algum dos atributos necessários é null e adiciona os erros necessários
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
        // Inicialmente, declara todos os atributos necessários na criação de uma skill
        String name = null;
        Long damage = null;
        Long cost = null;
        ElementTypes.types type = null;
    
        // Os atributos podem ser declarados em qualquer ordem, então é necessário percorrer
        // todos os atributos declarados e verificar qual é o tipo de cada um
        for(Declare_skill_attributeContext attr : ctx.declare_skill_attribute()){
            // Se o atributo for do tipo nome, então o valor do atributo é o nome da skill
            if(attr.declare_name() != null){
                name = attr.declare_name().IDENT().getText().trim();                        
            }
            // Se o atributo for do tipo damage, então o valor do atributo é o dano da skill
            else if(attr.declare_damage() != null){
                damage = Long.parseLong(attr.declare_damage().NUM().getText());                    
            }
            // Se o atributo for do tipo cost, então o valor do atributo é o custo da skill
            else if(attr.declare_cost() != null){
                cost = Long.parseLong(attr.declare_cost().NUM().getText());
            }
            // Se o atributo for do tipo type, então o valor do atributo é um tipo
            else if(attr.declare_type() != null){
                type = ElementTypes.getTypeFromString(attr.declare_type().TYPE().getText());                    
            }
        }
        // Verifica se algum dos atributos necessários é null e adiciona os erros necessários
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
        // Pega o pokemon atacante, o pokemon sendo atacado e a skill sendo utilizada das listas
        String Ofensive = ctx.IDENT().get(0).getText().trim(), Skill = ctx.IDENT().get(1).getText().trim(), Defensive = ctx.IDENT().get(2).getText().trim();
        Pokemon Of = pokemons.getPokemon(Ofensive);
        Pokemon Df = pokemons.getPokemon(Defensive);

        // Verifica se os pokemons existem e se a skill existe na lista do pokemon atacante
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
