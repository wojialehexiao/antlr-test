grammar JSON;

json
    : object
    | array
    ;

object
    : '{' pair (',' pair)* '}'  # AnObject
    | '{' '}'                   # EmptyObject
    ;

pair : STRING ':' value;

array
    : '[' value (',' value)* ']'    # ArrayOfValues
    | '[' ']'                       # EmptyArray
    ;

value
    : STRING    # String
    | NUMBER    # Atom
    | object    # ObjectValue
    | array     # ArrayValue
    | 'true'    # Atom
    | 'false'   # Atom
    | 'null'    # Atom
    ;

INT: '0' | [1-9][0-9]*;

NUMBER
    : '-'? INT
    | '-'? INT '.' INT EXP ?
    | '-'? INT EXP
    ;

EXP : [Ee] [+\-] ? INT ;

STRING : '"' .*? '"' ;
WS : [\t\r\n]+ -> skip ;


