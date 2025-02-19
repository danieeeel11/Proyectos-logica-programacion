package anlexico1;
import static anlexico1.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%%
int |
String |
var |
double |
boolean |
byte |
char |
float |
long |
for |
if |
else |
break |
import |
private |
public |
protected |
while {lexeme=yytext(); return Reservada;}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" {return Igual;}
"+" {return Suma;}
"-" {return Resta;}
"*" {return Multiplicacion;}
"/" {return Division;}
"^" {return Exponenciacion;}
"<" {return Menor_Que;}
"<=" {return Menor_o_Igual_Que;}
">" {return Mayor_Que;}
">=" {return Mayor_o_Igual_Que;}
"%" {return Modulo;}
"==" {return Es_Igual;}
"!=" {return Es_Distinto;}
"&&" {return And;}
"||" {return Or;}
"!" {return Not;}
"++" {return Incremento;}
"--" {return Decremento;}
"(" {return Parentesis_Abierto;}
")" {return Parentesis_Cerrado;}
";" {return Fin_Linea;}
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
 . {return ERROR;}