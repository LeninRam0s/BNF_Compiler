// Define a grammar called Hello
grammar BNF_Compiler;
program : (decimal | numero | id | while_T | print | for_T | if_T | else_T | tDato)+;

ignore: WS;
id  : TEXTO; // match keyword hello followed by an identifier
numero: NUMERO;
decimal: NUMERO (PUNTO NUMERO)+;
tDato: ((STRING id ASIGNACION cadena) | (INT id ASIGNACION numero) | (REAL id ASIGNACION decimal))?  PUNTOCOMA;

operadores: (SUMA|RESTA|MULT|DIV|MAYOR_IGUALQ|MENOR_IGUALQ|MAYOR_Q|MENOR_Q|IGUAL|DISTINTO|ASIGNACION)+;
simbolos: (LLAVES_A | LLAVES_C | PARENTESIS_A | PARENTESIS_C | CORCHETE_A | CORCHETE_C | PUNTO | DOSPUNTOS| PUNTOCOMA | COMILLAS | COMA)+;
equivalente: EQUIVALENTE PARENTESIS_A (cadena | id)? COMA (cadena | id)? PARENTESIS_C ;
cadena: COMILLAS (TEXTO | WS | TEXTO)+  COMILLAS;

while_T: WHILE (PARENTESIS_A (id | numero | decimal)+ operadores (id | numero | decimal)+  PARENTESIS_C LLAVES_A program? LLAVES_C PUNTOCOMA);
for_T: FOR PARENTESIS_A INT id ASIGNACION (id | numero) PUNTOCOMA id operadores numero PUNTOCOMA id operadores+ PARENTESIS_C LLAVES_A program? LLAVES_C PUNTOCOMA;
if_T: IF PARENTESIS_A ((numero operadores numero)+ | equivalente) PARENTESIS_C LLAVES_A (program | LLAVES_C)? LLAVES_C (program | LLAVES_C)?  PUNTOCOMA;
print: PRINT PARENTESIS_A cadena PARENTESIS_C PUNTOCOMA;
else_T: ELSE LLAVES_A (print | program)? LLAVES_C;



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
STRING: 'string';
REAL: 'float';
WHILE: 'while';

//IDENTIFICADOR
//ID : [A-Za-z] ;             // match lower-case identifiers
NUMERO: [0-9]+;
TEXTO: [A-Za-z0-9_]+;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines