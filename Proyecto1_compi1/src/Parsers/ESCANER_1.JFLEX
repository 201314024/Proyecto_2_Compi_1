package Parsers;
import java_cup.runtime.Symbol;
%%
numero =(-)?[0-9]+
letra = [a-z]|[A-Z]
lnombre= {letra} ({numero}|{letra}|_)*

lpath= \""C:"(\\{lnombre})+.jpg \"
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
"<Configuracion>" {return new Symbol(tabla_simbolos.Oconf, yycolumn,yyline, new String(yytext())); }
"</Configuracion>" {return new Symbol(tabla_simbolos.Cconf, yycolumn,yyline, new String(yytext())); }
"<fondo>" {return new Symbol(tabla_simbolos.Ofondo, yycolumn,yyline, new String(yytext())); }
"</fondo>" {return new Symbol(tabla_simbolos.Cfondo, yycolumn,yyline, new String(yytext())); }
"<disenio>" {return new Symbol(tabla_simbolos.Odis, yycolumn,yyline, new String(yytext())); }
"</disenio>" {return new Symbol(tabla_simbolos.Cdis, yycolumn,yyline, new String(yytext())); }
"path" {return new Symbol(tabla_simbolos.tpath, yycolumn,yyline, new String(yytext())); }
"nombre" {return new Symbol(tabla_simbolos.tnomb, yycolumn,yyline, new String(yytext())); }
"tipo" {return new Symbol(tabla_simbolos.ttipo, yycolumn,yyline, new String(yytext())); }
"puntos" {return new Symbol(tabla_simbolos.tpuntos, yycolumn,yyline, new String(yytext())); }
"crecimiento" {return new Symbol(tabla_simbolos.tcreci, yycolumn,yyline, new String(yytext())); }
"tiempo" {return new Symbol(tabla_simbolos.ttiempo, yycolumn,yyline, new String(yytext())); }
{lpath} {return new Symbol(tabla_simbolos.tlpath, yycolumn,yyline, new String(yytext())); }
/* SIMBOLOS */
"{" {return new Symbol(tabla_simbolos.Ollave, yycolumn,yyline, new String(yytext())); }
"}" {return new Symbol(tabla_simbolos.Cllave, yycolumn,yyline, new String(yytext())); }
"[" {return new Symbol(tabla_simbolos.Ocorch, yycolumn,yyline, new String(yytext())); }
"]" {return new Symbol(tabla_simbolos.Ccorch, yycolumn,yyline, new String(yytext())); }
"_" {return new Symbol(tabla_simbolos.tgionb, yycolumn,yyline, new String(yytext())); }
"/" {return new Symbol(tabla_simbolos.tdiag, yycolumn,yyline, new String(yytext())); }
":" {return new Symbol(tabla_simbolos.tpunts, yycolumn,yyline, new String(yytext())); }
";" {return new Symbol(tabla_simbolos.tpuntycom, yycolumn,yyline, new String(yytext())); }
"," {return new Symbol(tabla_simbolos.tcom, yycolumn,yyline, new String(yytext())); }
"=" {return new Symbol(tabla_simbolos.tigual, yycolumn,yyline, new String(yytext())); }
/* NUMEROS */
{numero} {return new Symbol(tabla_simbolos.tnumero, yycolumn,yyline,new String(yytext()));}
/* PALABRAS */
{lnombre} {return new Symbol(tabla_simbolos.tlnombre, yycolumn,yyline,new String(yytext()));}
/* BLANCOS */
[ \t\r\f\n]+ { /* Se ignoran */}
/* CUAQUIER OTRO */
. { System.out.println("Error Lexico en: "+yycolumn+" , "+yyline+" Simbolo="+yytext()); }