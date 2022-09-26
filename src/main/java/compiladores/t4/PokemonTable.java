package compiladores.t4;

import java.util.HashMap;

import compiladores.t4.ElementTypes.types;

public class PokemonTable {

    public class Pokemon{
        Long hp;
        Long pp;
        ElementTypes.types type;
        HashMap<String, Integer> skills;

        public Pokemon(Long hp, Long pp, types type, HashMap<String, Integer> skills) {
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

    public void insert(String name, Long hp, Long pp, types type, HashMap<String, Integer> skills){
        if(!pokemons.containsKey(name))
            pokemons.put(name, new Pokemon(hp, pp, type, skills));
    }

    public Pokemon getPokemon(String name){
        return pokemons.get(name); 
    }

    public HashMap<String, Pokemon> getTable(){
        return pokemons;
    }
}
