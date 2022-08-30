grammar Pokemon;

RESERVED_WORD: 'type' | 'skills' | 'weight' | 'HP' | 'PP' | 'name' | 'declare' | 'skill' | 'pokemon' | 'fim_declare' | ':';

IDENT: [A-Z]([a-zA-Z] + NUM)*;

NUM: [0-9];

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
    'includenormal' |
    'poison' |
    'psychic' |
    'rock' |
    'steel' |
    'water';


declare_skill: IDENT '(' NUM ')';