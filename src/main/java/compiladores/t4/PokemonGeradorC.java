package compiladores.t4;

import compiladores.t4.PokemonParser.AttackContext;
import compiladores.t4.PokemonParser.BattleContext;
import compiladores.t4.PokemonParser.Declare_pokemonContext;
import compiladores.t4.PokemonParser.Declare_pokemon_attributeContext;
import compiladores.t4.PokemonParser.Declare_skillContext;
import compiladores.t4.PokemonParser.Declare_skill_attributeContext;
import compiladores.t4.PokemonParser.Declare_skillsContext;
import compiladores.t4.PokemonParser.ProgramContext;

public class PokemonGeradorC extends PokemonBaseVisitor<Void>{
    StringBuilder out;
    PokemonAscii pokemonAscii;
       
    public PokemonGeradorC(){
        out = new StringBuilder();
        pokemonAscii = new PokemonAscii(out);
    } 

    @Override
    public Void visitProgram(ProgramContext ctx) {
        // TODO Auto-generated method stub
        // Inicialmente, declara todas as classes e funções necessárias para o funcionamento do programa
        // Isto inclui uma classe para os pokemons e uma classe para as skills

        // A classe pokemon tem uma função útil chamada "attack", que recebe como parâmetro uma skill
        // e um pokemon alvo e faz toda a verificação necessária para saber se o pokemon pode usar a skill
        // e se o pokemon alvo pode ser atacado
        out.append("#include<bits/stdc++.h>\n");
        out.append("#include<stdio.h>\n");
        out.append("#define turnos vector<vector<string>>\n");
        out.append("\n");
        out.append("using namespace std;\n");
        out.append("\n");
        out.append("//Professor achamos uma função muito legal para deixar o trabalho mais bonito!\n");
        out.append("//ela vai estar implementada ao final da main!\n");
        out.append("//Pq gostamos de você S2\n");
        out.append("void print_pokemon(int n_pokemon);\n");
        out.append("\n");
        pokemonAscii.mapPokemonNames();
        out.append("\n");
        out.append("class Skill{\n");
        out.append("    public:\n");
        out.append("    string name;\n");
        out.append("    int cost, dmg, uses;\n");
        out.append("    string type;\n");
        out.append("\n");
        out.append("    Skill(string name, int cost, int dmg, int uses, string type){\n");
        out.append("        this->name = name;\n");
        out.append("        this->cost = cost;\n");
        out.append("        this->dmg = dmg;\n");
        out.append("        this->uses = uses;\n");
        out.append("        this->type = type;\n");
        out.append("    }\n");
        out.append("    Skill(){\n");
        out.append("        \n");
        out.append("    }\n");
        out.append("};\n");
        out.append("\n");
        out.append("\n");
        out.append("class Pokemon{\n");
        out.append("    public:\n");
        out.append("    string name;\n");
        out.append("    int hp, pp;\n");
        out.append("    string type;\n");
        out.append("    map<string, Skill> skills;\n");
        out.append("\n");
        out.append("    Pokemon(string name, int hp, int pp, string type, map<string, Skill> skills){\n");
        out.append("        this->name = name;\n");
        out.append("        this->hp = hp;\n");
        out.append("        this->pp = pp;\n");
        out.append("        this->type = type;\n");
        out.append("        this->skills = skills;\n");
        out.append("    }\n");
        out.append("\n");
        out.append("    Pokemon(){\n");
        out.append("\n");
        out.append("    }\n");
        out.append("\n");
        out.append("    bool attack(Pokemon &a, string skillName){\n");
        out.append("        bool dead = a.hp > this->hp;\n");
        out.append("        if(a.hp <= 0 || this->hp <= 0){\n");
        out.append("            cout << \"Impossivel atacar \" + (dead ? this->name : a.name) + \" está morto!\" << endl << endl; \n");
        out.append("            return false;\n");
        out.append("        }\n");
        out.append("        if(skills[skillName].uses == 0){\n");
        out.append("            cout << skillName + \" ja foi utilizada o maximo possivel pelo pokemon \" + this->name  << endl << endl;\n");
        out.append("            return false;\n");
        out.append("        }\n");
        out.append("        \n");
        out.append("        skills[skillName].uses--;\n");
        out.append("\n");
        out.append("        pp -= skills[skillName].cost;\n");
        out.append("\n");
        out.append("        if(pp < 0){\n");
        out.append("            cout << \"Impossivel utilizar \" + skillName + \" faltam \" << pp * -1 << \" Power Points\"<< endl << endl;\n");
        out.append("            pp += skills[skillName].cost;\n");
        out.append("            return false;\n");
        out.append("        }\n");
        out.append("        cout << this->name + \" usou \" + skillName + \" em \" + a.name + \" com sucesso \" << endl;\n");
        out.append("        a.hp -= skills[skillName].dmg;\n");
        out.append("        cout << \"Vidas Atuais:\\n\" + this->name + \": \"<< this->hp << \" ------------VS------------ \" + a.name + \": \" << a.hp << endl;\n");
        out.append("        if(a.hp <= 0){\n");
        out.append("            cout << \">>>>>>>>>>>> \" + this->name + \" DECLARADO VENCEDOR DA BATALHA CONTRA \" + a.name + \" <<<<<<<<<<<<\"<< endl;\n");
        out.append("                if(PokemonToAsciiIdx.find(this->name) != PokemonToAsciiIdx.end())\n");
        out.append("                        print_pokemon(PokemonToAsciiIdx[this->name])\n;");
        out.append("        }\n");
        out.append("        cout << endl;\n");
        out.append("        return true;\n");
        out.append("    }\n");
        out.append("\n");
        out.append("};\n");
        out.append("\n");
        out.append("\n");
        out.append("int main(){\n");
        out.append("    map<string, Skill> exKill;\n");
        
        ctx.declare_skill().forEach(skl -> visitDeclare_skill(skl));
        
        out.append("    map<string, Pokemon> poquemao;\n");
        
        out.append("    map<string, Skill> skills;\n");

        out.append("    vector<pair<string,long long int>> skls;\n");
        
        ctx.declare_pokemon().forEach(pkm -> visitDeclare_pokemon(pkm));

        out.append("    map<pair<string, string>, int> atksInvalidos;\n");

        visitBattle(ctx.battle());
        
        out.append("}\n");
 
        pokemonAscii.funcPrintPokemon();
        

        return null;
    }

    @Override
    public Void visitDeclare_skill(Declare_skillContext ctx) {
        // Pega os atriibutos necessários para declarar uma skill 
        // e imprime no arquivo de saída as declarações necessárias
        // para a criação utilizando a classe em cpp
        String name = null;
        Long damage = null;
        Long cost = null;
        String type = null;
    
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
                type = attr.declare_type().TYPE().getText();                    
            }
        }

        // A main cria uma lista de skills 'exKill' e, a partir dela, mantém controle sobre as skills registradas
        out.append("    exKill[\"" + name + "\"] = Skill(\"" + name + "\", " + cost + ", " + damage + ", 0, \""+ type + "\");\n");
        return null;
    }

    @Override
    public Void visitDeclare_pokemon(Declare_pokemonContext ctx) {
        // Pega os atriibutos necessários para declarar um pokemon
        // e imprime no arquivo de saída as declarações necessárias
        // para a criação utilizando a classe em cpp
        out.append("    skills.clear();\n");
        String name = null;
        Long hp = null;
        Long pp = null;
        String type = null;
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
                visitDeclare_skills(attr.declare_skills());
            }
            else if(attr.declare_type() != null){
                type = attr.declare_type().TYPE().getText();           
            }
        }
        

        // Para cada skill do pokemon, pega a skill da lista de skills global e adiciona na lista de 
        // skills do pokemon
        out.append("    for(auto i : skls){\n");
        out.append("        Skill aux;\n");    
        out.append("        aux = exKill[i.first];\n");
        out.append("        aux.uses = i.second;\n");
        out.append("        skills[i.first] = aux;\n");
        out.append("    }\n");

        // A main cria uma lista de pokemons 'poquemao' e, a partir dela, mantém controle sobre os pokemons registrados
        out.append("    poquemao[\"" + name + "\"] = Pokemon(\""+ name + "\", " + hp + ", " + pp + ", \"" + type + "\", " + "skills);\n");

        return null;
    }

    @Override
    public Void visitDeclare_skills(Declare_skillsContext ctx) {
        // TODO Auto-generated method stub

        // Pega os atriibutos necessários para declarar as skills de um pokemon
        // A skill em si já está cadastrada na lista global. Portanto, basta pegarmos o nome
        // e a quantidade de usos e adicionarmos na lista de skills do pokemon
        out.append("    skls = {");
        for(int i = 0; i < ctx.IDENT().size(); i++){
            out.append((i >= 1 ? "," : "") + "{\"" + ctx.IDENT().get(i).getText() + "\", " + ctx.NUM().get(i).getText() + "}");
        }
        out.append("};\n");

        return null;
    }

    @Override
    public Void visitAttack(AttackContext ctx) {
        // TODO Auto-generated method stub
        // Pega os atributos necessários para declarar um ataque
        // Para o código ficar menos poluído, guardamos um array de strings com o nome
        // do atacante, do ataque e do atacado. Depois criamos um for para todos os ataques registrados
        out.append("{\"" + ctx.IDENT().get(0).getText().trim() + "\", \"" + ctx.IDENT().get(1).getText().trim() + "\", \"" + ctx.IDENT().get(2).getText().trim() + "\"}");

        return null;
    }

    @Override
    public Void visitBattle(BattleContext ctx) {
        // TODO Auto-generated method stub

        out.append("    vector<vector<string>> attck = {");

        // Iteramos dentro todos os ataques registrados, chamamos visitAttack para 
        // guardá-los no array attck
        for(int i = 0; i < ctx.attack().size(); i++){
            out.append((i >= 1 ? "," : ""));
            visitAttack(ctx.attack().get(i));
        }
        out.append("    };\n");

        // Iteramos dentre todos os ataques salvos em attk e chamamos a função de batalha
        out.append("    for(auto i : attck){\n");
        out.append("        if(!poquemao[i[0]].attack(poquemao[i[2]], i[1]))\n");
        out.append("            atksInvalidos[{min(i[0],i[2]), max(i[0], i[2])}]++;\n");
        out.append("    }\n");
        return null;
    }

}
