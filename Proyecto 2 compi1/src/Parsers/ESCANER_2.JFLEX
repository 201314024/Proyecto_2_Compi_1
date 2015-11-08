package Parsers;
import java_cup.runtime.Symbol;
%%
numero =(-)?[0-9]*
letra = [a-z]|[A-Z]
lnombre= {letra} ({numero}|{letra})*
fnombre= {letra} ({numero}|{letra})*
casilla=  {lnombre}|{numero}
%cupsym tabla_simbolos2
%class lexico_2
%cup
%public
%unicode
%line
%column
%char
%ignorecase
%%
/* PALABRAS RESERVADAS */
"columna" {return new Symbol(tabla_simbolos2.tcolum, yycolumn,yyline, new String(yytext())); }
{letra} {return new Symbol(tabla_simbolos2.tletra, yycolumn,yyline,new String(yytext()));}
{casilla} {return new Symbol(tabla_simbolos2.tcasi, yycolumn,yyline,new String(yytext()));}
/* SIMBOLOS */
"{" {return new Symbol(tabla_simbolos2.Ollave, yycolumn,yyline, new String(yytext())); }
"}" {return new Symbol(tabla_simbolos2.Cllave, yycolumn,yyline, new String(yytext())); }
"[" {return new Symbol(tabla_simbolos2.Ocorch, yycolumn,yyline, new String(yytext())); }
"]" {return new Symbol(tabla_simbolos2.Ccorch, yycolumn,yyline, new String(yytext())); }
"," {return new Symbol(tabla_simbolos2.tcom, yycolumn,yyline, new String(yytext())); }
":" {return new Symbol(tabla_simbolos2.tpunts, yycolumn,yyline, new String(yytext())); }
/* NUMEROS */
{numero} {return new Symbol(tabla_simbolos2.tnumero, yycolumn,yyline,new String(yytext()));}
/* PALABRAS */
{lnombre} {return new Symbol(tabla_simbolos2.tlnombre, yycolumn,yyline,new String(yytext()));}
/* BLANCOS */
[ \t\r\f\n]+ { /* Se ignoran */}
/* CUAQUIER OTRO */
. { System.out.println("Error Lexico en la columna: "+yycolumn+" , y la linea: "+yyline+" Simbolo= "+yytext()); }