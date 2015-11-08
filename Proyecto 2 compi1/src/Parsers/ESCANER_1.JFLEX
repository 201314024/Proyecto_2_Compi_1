package Parsers;
import java_cup.runtime.Symbol;
%%
numero =(-)?[0-9]+
letra = [a-z]|[A-Z]
lnombre= {letra} ({numero}|{letra}|_)*
cnombre=\"{lnombre}\"
lpath= \""C:"(\\{lnombre})+\"
lfecha= [0-9]+"/"[0-9]+"/"[0-9]+
%cupsym tabla_simbolos
%class lexico_1
%cup
%public
%unicode
%line
%column
%char
%ignorecase
%%
/* PALABRAS RESERVADAS */
"Proyecto" {return new Symbol(tabla_simbolos.Tproy, yycolumn,yyline, new String(yytext())); }
"nombre" {return new Symbol(tabla_simbolos.tnomb, yycolumn,yyline, new String(yytext())); }
"path" {return new Symbol(tabla_simbolos.Tpath, yycolumn,yyline, new String(yytext())); }
"fecha" {return new Symbol(tabla_simbolos.Tfecha, yycolumn,yyline, new String(yytext())); }
{lpath} {return new Symbol(tabla_simbolos.tlpath, yycolumn,yyline, new String(yytext())); }
{cnombre} {return new Symbol(tabla_simbolos.tcnombre, yycolumn,yyline, new String(yytext())); }
{lfecha} {return new Symbol(tabla_simbolos.tlfecha, yycolumn,yyline, new String(yytext())); }
/* SIMBOLOS */
"{" {return new Symbol(tabla_simbolos.Ollave, yycolumn,yyline, new String(yytext())); }
"}" {return new Symbol(tabla_simbolos.Cllave, yycolumn,yyline, new String(yytext())); }
"[" {return new Symbol(tabla_simbolos.Ocorch, yycolumn,yyline, new String(yytext())); }
"]" {return new Symbol(tabla_simbolos.Ccorch, yycolumn,yyline, new String(yytext())); }
":" {return new Symbol(tabla_simbolos.tpunts, yycolumn,yyline, new String(yytext())); }
";" {return new Symbol(tabla_simbolos.tpuntycom, yycolumn,yyline, new String(yytext())); }
/* NUMEROS */
{numero} {return new Symbol(tabla_simbolos.tnumero, yycolumn,yyline,new String(yytext()));}
/* PALABRAS */
{lnombre} {return new Symbol(tabla_simbolos.tlnombre, yycolumn,yyline,new String(yytext()));}
/* BLANCOS */
[ \t\r\f\n]+ { /* Se ignoran */}
/* CUAQUIER OTRO */
. { System.out.println("Error Lexico en: "+yycolumn+" , "+yyline+" Simbolo="+yytext()); }