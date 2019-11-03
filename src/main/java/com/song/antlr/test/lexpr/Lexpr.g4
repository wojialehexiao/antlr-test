grammar Lexpr;

s : e ;


e : e MUL e     # Mult
  | e ADD e     # Add
  | INT         # Int
  ;


ID : [a-zA-Z]+;
INT : [0-9]+ ;
NEWLINE : '\r'?'\n' ;
WS : [\t]+ -> skip ;

MUL : '*';
DIV : '/';
ADD : '+';
SUB : '-';