package compiladores.t4;

import java.util.HashMap;

public class SkillTable {

    public class Skill{
        Integer cost;
        Integer damage;
        ElementTypes.types type;

        public Skill(Integer cost, Integer damage, ElementTypes.types type){
            this.cost = cost;
            this.damage = damage;
            this.type = type;
        }
    }

    private HashMap<String, Skill> skills;
    public SkillTable(){
        skills = new HashMap<>();
    }

    public void insert(String name, Integer cost, Integer damage, ElementTypes.types type){
        if(!skills.containsKey(name))
            skills.put(name, new Skill(cost, damage, type));
    }

    public Skill getSkill(String name){
        return skills.get(name); 
    }
}
