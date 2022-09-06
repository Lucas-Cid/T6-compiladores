package compiladores.t4;

public class ElementTypes {
    public enum types{
        BUG, 
        DRAGON, 
        ELETRIC, 
        FAIRY, 
        FIGHTING, 
        FIRE, 
        FLYING, 
        GHOST, 
        GRASS, 
        GROUND, 
        NORMAL, 
        POISON, 
        PSYCHIC, 
        ROCK, 
        STEEL, 
        WATER    
    }

    public static ElementTypes.types getTypeFromString(String type){
        switch(type){
            case "bug":     return ElementTypes.types.BUG;
            case "dragon":  return ElementTypes.types.DRAGON;
            case "eletric": return ElementTypes.types.ELETRIC;
            case "fairy":   return ElementTypes.types.FAIRY;
            case "fighting":return ElementTypes.types.FIGHTING;
            case "fire":    return ElementTypes.types.FIRE;
            case "flying":  return ElementTypes.types.FLYING;
            case "ghost":   return ElementTypes.types.GHOST;
            case "grass":   return ElementTypes.types.GRASS;
            case "ground":  return ElementTypes.types.GROUND;
            case "normal":  return ElementTypes.types.NORMAL;
            case "poison":  return ElementTypes.types.POISON;
            case "psychic": return ElementTypes.types.PSYCHIC;
            case "rock":    return ElementTypes.types.ROCK;
            case "steel":   return ElementTypes.types.STEEL;
            case "water":   return ElementTypes.types.WATER;
            default: return null;
        }
    }
}
