grammar PropertyFile;

file : prop+;
prop : ID '=' STRING '\n';


ID:('a'..'z'|'A'..'Z')+;
INT:'0'..'9'+;
STRING : '"' .*? '"' ;
WS : [\t\r\n]+ -> skip ;