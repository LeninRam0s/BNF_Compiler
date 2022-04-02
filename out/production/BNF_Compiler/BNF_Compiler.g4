// Define a grammar called Hello
grammar BNF_Compiler;
program : (decimal | numero | id | while_T | print | for_T | if_T)+;

ignore: WS;
id  : TEXTO; // match keyword hello followed by an identifier
numero: NUMERO;
decimal: NUMERO (PUNTO NUMERO)+PUNTOCOMA;

operadores: (SUMA|RESTA|MULT|DIV|MAYOR_IGUALQ|MENOR_IGUALQ|MAYOR_Q|MENOR_Q|IGUAL|DISTINTO|ASIGNACION)+;
simbolos: (LLAVES_A | LLAVES_C | PARENTESIS_A | PARENTESIS_C | CORCHETE_A | CORCHETE_C | PUNTO | DOSPUNTOS| PUNTOCOMA | COMILLAS | COMA)+;
equivalente: EQUIVALENTE PARENTESIS_A (CADENA | id)? COMA (CADENA | id)? PARENTESIS_C ;

while_T: WHILE (PARENTESIS_A (id | numero | decimal)+ operadores (id | numero | decimal)+  PARENTESIS_C LLAVES_A program? LLAVES_C PUNTOCOMA);
for_T: FOR PARENTESIS_A INT id ASIGNACION (id | NUMERO) PUNTOCOMA id operadores NUMERO PUNTOCOMA id operadores+ PARENTESIS_C LLAVES_A program? LLAVES_C PUNTOCOMA;
if_T: IF PARENTESIS_A ((NUMERO operadores NUMERO)+ | equivalente) PARENTESIS_C LLAVES_A program? LLAVES_C PUNTOCOMA;
print: PRINT PARENTESIS_A CADENA PARENTESIS_C PUNTOCOMA;
else_T: ELSE LLAVES_A (print | program)? LLAVES_C;

CADENA: COMILLAS (TEXTO | TEXTO*)+ COMILLAS;

//OPERADORES
SUMA:'+';
RESTA:'-';
MULT:'*';
DIV:'/';
ASIGNACION: '=';
MAYOR_IGUALQ:'>=';
MENOR_IGUALQ: '<=';
MAYOR_Q:'>';
MENOR_Q:'<';
IGUAL: '==';
EQUIVALENTE: 'equivalente';
DISTINTO: '<>';

//SIMBOLOS
LLAVES_A:'{';
LLAVES_C:'}';
CORCHETE_A:'[';
CORCHETE_C:']';
PARENTESIS_A:'(';
PARENTESIS_C:')';
COMA: ',';
PUNTO: '.';
PUNTOCOMA: ';';
DOSPUNTOS: ':';
COMILLAS: '"';
//ESPACIO: ' ';

//PALABRAS RESERVADAS
IF:'if';
ELSE: 'else';
FOR:'for';
PRINT: 'print';
INT: 'int';
STRING: 'String';
WHILE: 'while';

//IDENTIFICADOR
//ID : [A-Za-z] ;             // match lower-case identifiers
NUMERO: [0-9]+;
TEXTO: [A-Za-z0-9_]+;




WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines