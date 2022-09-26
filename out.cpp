#include<bits/stdc++.h>
#include<stdio.h>
#define turnos vector<vector<string>>

using namespace std;

//Professor achamos uma função muito legal para deixar o trabalho mais bonito!
//ela vai estar implementada ao final da main!
//Pq gostamos de você S2
void print_pokemon(int n_pokemon);

class Skill{
    public:
    string name;
    int cost, dmg, uses;
    string type;

    Skill(string name, int cost, int dmg, int uses, string type){
        this->name = name;
        this->cost = cost;
        this->dmg = dmg;
        this->uses = uses;
        this->type = type;
    }
    Skill(){
        
    }
};


class Pokemon{
    public:
    string name;
    int hp, pp;
    string type;
    map<string, Skill> skills;

    Pokemon(string name, int hp, int pp, string type, map<string, Skill> skills){
        this->name = name;
        this->hp = hp;
        this->pp = pp;
        this->type = type;
        this->skills = skills;
    }

    Pokemon(){

    }

    bool attack(Pokemon &a, string skillName){
        bool dead = a.hp > this->hp;
        if(a.hp <= 0 || this->hp <= 0){
            cout << "Impossivel atacar " + (dead ? this->name : a.name) + " está morto!\n"; 
            return false;
        }
        if(skills[skillName].uses == 0){
            cout << skillName + " ja foi utilizada o maximo possivel\n";
            return false;
        }
        
        skills[skillName].uses--;

        pp -= skills[skillName].cost;

        if(pp < 0){
            cout << "Impossivel utilizar " + skillName + " faltam " << pp * -1 << " Power Points"<< endl;
            pp += skills[skillName].cost;
            return false;
        }
        cout << "Ataque de " + this->name + " feito com sucesso!\n";
        a.hp -= skills[skillName].dmg;
        cout << "Vidas Atuais:\n" + this->name + ": "<< this->hp << " ------------VS------------ " + a.name + ": " << a.hp;
        if(a.hp <= 0)
            cout << ">>>>>>>>>>>> " + this->name + " DECLARADO VENCEDOR DA BATALHA CONTRA " + a.name + " <<<<<<<<<<<<"<< endl;
        return true;
    }

};


int main(){
    map<string, Skill> exKill;
    exKill["raio"] = Skill("raio", 10, 35, 0, "eletric");
    exKill["bola de fogo"] = Skill("bola de fogo", 15, 10, 0, "fire");
    map<string, Pokemon> poquemao;
    map<string, Skill> skills;
    vector<pair<string,long long int>> skls;
    skills.clear();
    skls = {{"bola de fogo", 3}};
    for(auto i : skls){
        Skill aux;
        aux = exKill[i.first];
        aux.uses = i.second;
        skills[i.first] = aux;
    }
    poquemao["pokemon1"] = Pokemon("pokemon1", 100, 50, "fire", skills);
    skills.clear();
    skls = {{"raio", 3}};
    for(auto i : skls){
        Skill aux;
        aux = exKill[i.first];
        aux.uses = i.second;
        skills[i.first] = aux;
    }
    poquemao["pokemon2"] = Pokemon("pokemon2", 150, 30, "eletric", skills);
    map<pair<string, string>, int> atksInvalidos;
    vector<vector<string>> attck = {{"pokemon2 ", "raio ", "pokemon1"},{"pokemon2 ", "raio ", "pokemon1"},{"pokemon2 ", "raio ", "pokemon1"}    };
    for(auto i : attck){
        if(!poquemao[i[0]].attack(poquemao[i[2]], i[1]))
            atksInvalidos[{min(i[0],i[2]), max(i[0], i[2])}]++;
    }
}
