grammar Pokemon;

// Um programa é composto por declarações de skill, declarações de pokemons e uma batalha
program: (declare_skill)*  (declare_pokemon)* battle;

// A declaração de skill é composta por vários componentes declare_skill_attribute
// Isso é feito para permitir que os atributos possam ser colocados em qualquer ordem na declaração
declare_skill: 'declare skill:' declare_skill_attribute* 'fim_declare';

// Aqui, qualquer atributo pode ser declarado
declare_skill_attribute: declare_name | declare_damage | declare_cost | declare_type;

// A declaração de pokemon é composta por vários componentes declare_pokemon_attribute
// Isso é feito para permitir que os atributos possam ser colocados em qualquer ordem na declaração
declare_pokemon: 'declare pokemon:' declare_pokemon_attribute* 'fim_declare';

// Aqui, qualquer atributo pode ser declarado
declare_pokemon_attribute: declare_name | declare_hp | declare_pp | declare_type | declare_skills;

// Uma batalha é composta por vários ataques
battle: 'begin_batalha:' (attack)* 'end_batalha';

// Aqui são definidos todos os atributos possíveis e necessários na criação de pokemons e skills
declare_name: 'name:' IDENT;

declare_damage: 'damage:' NUM;

declare_cost: 'cost:' NUM;

declare_type: 'type:' TYPE;  

declare_hp: 'HP:' NUM; 

declare_pp: 'PP:' NUM; 

// As skills de um pokemon são separadas por vírgula e apresentam, separado por [ ], 
// o número de vezes que a skill pode ser usada
declare_skills: 'skills:' IDENT'['NUM']' (',' IDENT '['NUM']')*;

// Um ataque é composto por um pokemon atacante, uma skill e um pokemon defensor, respectivamente
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