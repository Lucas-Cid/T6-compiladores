grammar Pokemon;

program: (declare_skill)*  (declare_pokemon)* battle;

declare_skill: 'declare skill:' declare_skill_attribute* 'fim_declare';

declare_skill_attribute: declare_name | declare_damage | declare_cost | declare_type;

declare_pokemon: 'declare pokemon:' declare_pokemon_attribute* 'fim_declare';

declare_pokemon_attribute: declare_name | declare_hp | declare_pp | declare_type | declare_skills;

battle: 'begin_batalha:' (attack)* 'end_batalha';

declare_name: 'name:' IDENT;

declare_damage: 'damage:' NUM;

declare_cost: 'cost:' NUM;

declare_type: 'type:' TYPE;  

declare_hp: 'HP:' NUM; 

declare_pp: 'PP:' NUM; 

declare_skills: 'skills:' IDENT'['NUM']' (',' IDENT '['NUM']')*;

attack: IDENT 'USES' IDENT 'ON' IDENT;

RESERVED_WORD: 'type' |
               'skills' | 
               'damage' | 
               'weight' |
               'type' |
               'HP' | 
               'PP' |
               'cost' |
               'name' | 
               'skill' | 
               'pokemon' | 
               'declare' | 
               'fim_declare' | 
               'begin_batalha' |
               'end_batalha' |
               'uses' |
               'on' |
               ':';

TYPE: 
    'bug' |
    'dragon' |
    'eletric' |
    'fairy' |
    'fighting' |
    'fire' |
    'flying' |
    'ghost' |
    'grass' |
    'ground' |
    'normal' |
    'poison' |
    'psychic' |
    'rock' |
    'steel' |
    'water';

IDENT: [a-zA-Z]([a-z ] | NUM)*;

NUM: [0-9]+;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();};