package compiladores.t4;

import java.util.HashMap;

import compiladores.t4.ElementTypes.types;

public class PokemonTable {

    public class Pokemon{
        Integer hp;
        Integer pp;
        ElementTypes.types type;
        HashMap<String, Integer> skills;

        public Pokemon(Integer hp, Integer pp, types type, HashMap<String, Integer> skills) {
            this.hp = hp;
            this.pp = pp;
            this.type = type;
            this.skills = skills;
        }
    }

    private HashMap<String, Pokemon> pokemons;
    public PokemonTable(){
        pokemons = new HashMap<>();
    }

    public void insert(String name, Integer hp, Integer pp, types type, HashMap<String, Integer> skills){
        if(!pokemons.containsKey(name))
            pokemons.put(name, new Pokemon(hp, pp, type, skills));
    }

    public Pokemon getPokemon(String name){
        return pokemons.get(name); 
    }
}
