package Parsers;
import java_cup.runtime.Symbol;
%%
numero =(-)?[0-9]+
letra = [a-z]|[A-Z]
lnombre= {letra} ({numero}|{letra}|_)*
movimiento= "arriba"|"abajo"|"izquierda"|"derecha"|"atras"
Cmovimientos= {movimiento}(","{movimiento})*
%cupsym tabla_simbolos3
%class lexico_3
%cup
%public
%unicode
%line
%column
%char
%ignorecase
%%
/* PALABRAS RESERVADAS */
"estrategias" {return new Symbol(tabla_simbolos3.test, yycolumn,yyline, new String(yytext())); }
"movimientos" {return new Symbol(tabla_simbolos3.tmovs, yycolumn,yyline, new String(yytext())); }
{Cmovimientos} {return new Symbol(tabla_simbolos3.tCmovs, yycolumn,yyline, new String(yytext())); }
/* SIMBOLOS */
"{" {return new Symbol(tabla_simbolos3.Ollave, yycolumn,yyline, new String(yytext())); }
"}" {return new Symbol(tabla_simbolos3.Cllave, yycolumn,yyline, new String(yytext())); }
"[" {return new Symbol(tabla_simbolos3.Ocorch, yycolumn,yyline, new String(yytext())); }
"]" {return new Symbol(tabla_simbolos3.Ccorch, yycolumn,yyline, new String(yytext())); }
":" {return new Symbol(tabla_simbolos3.tpunts, yycolumn,yyline, new String(yytext())); }
"," {return new Symbol(tabla_simbolos3.tcom, yycolumn,yyline, new String(yytext())); }
/* NUMEROS */
{numero} {return new Symbol(tabla_simbolos3.tnumero, yycolumn,yyline,new String(yytext()));}
/* PALABRAS */
{lnombre} {return new Symbol(tabla_simbolos3.tlnombre, yycolumn,yyline,new String(yytext()));}
/* BLANCOS */
[ \t\r\f\n]+ { /* Se ignoran */}
/* CUAQUIER OTRO */
. { System.out.println("Error Lexico en: la columna: "+yycolumn+" , y la linea: "+yyline+" Simbolo="+yytext()); }