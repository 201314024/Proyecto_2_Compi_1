package Parsers;
import java_cup.runtime.Symbol;
%%
numero =(-)?[0-9]+
letra = [a-z]|[A-Z]
lnombre= {letra} ({numero}|{letra}|_)*
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
"<escenario" {return new Symbol(tabla_simbolos2.Oesce, yycolumn,yyline, new String(yytext())); }
"</escenario>" {return new Symbol(tabla_simbolos2.Cesce, yycolumn,yyline, new String(yytext())); }
"<paredes>" {return new Symbol(tabla_simbolos2.Opared, yycolumn,yyline, new String(yytext())); }
"</paredes>" {return new Symbol(tabla_simbolos2.Cpared, yycolumn,yyline, new String(yytext())); }
"<extras>" {return new Symbol(tabla_simbolos2.Oex, yycolumn,yyline, new String(yytext())); }
"</extras>" {return new Symbol(tabla_simbolos2.Cex, yycolumn,yyline, new String(yytext())); }
"<estrella>" {return new Symbol(tabla_simbolos2.Oest, yycolumn,yyline, new String(yytext())); }
"</estrella>" {return new Symbol(tabla_simbolos2.Cest, yycolumn,yyline, new String(yytext())); }
"<bonus>" {return new Symbol(tabla_simbolos2.Obon, yycolumn,yyline, new String(yytext())); }
"</bonus>" {return new Symbol(tabla_simbolos2.Cbon, yycolumn,yyline, new String(yytext())); }
"<manzana>" {return new Symbol(tabla_simbolos2.Oman, yycolumn,yyline, new String(yytext())); }
"</manzana>" {return new Symbol(tabla_simbolos2.Cman, yycolumn,yyline, new String(yytext())); }
"<veneno>" {return new Symbol(tabla_simbolos2.Oven, yycolumn,yyline, new String(yytext())); }
"</veneno>" {return new Symbol(tabla_simbolos2.Cven, yycolumn,yyline, new String(yytext())); }
"<bomba>" {return new Symbol(tabla_simbolos2.Obom, yycolumn,yyline, new String(yytext())); }
"</bomba>" {return new Symbol(tabla_simbolos2.Cbom, yycolumn,yyline, new String(yytext())); }
"fondo" {return new Symbol(tabla_simbolos2.tfondo, yycolumn,yyline, new String(yytext())); }
"ancho" {return new Symbol(tabla_simbolos2.tancho, yycolumn,yyline, new String(yytext())); }
"alto" {return new Symbol(tabla_simbolos2.talto, yycolumn,yyline, new String(yytext())); }
/* SIMBOLOS */
"(" {return new Symbol(tabla_simbolos2.Oparen, yycolumn,yyline, new String(yytext())); }
")" {return new Symbol(tabla_simbolos2.Cparen, yycolumn,yyline, new String(yytext())); }
">" {return new Symbol(tabla_simbolos2.Ctag, yycolumn,yyline, new String(yytext())); }
".." {return new Symbol(tabla_simbolos2.tdpunt, yycolumn,yyline, new String(yytext())); }
";" {return new Symbol(tabla_simbolos2.tpuntycom, yycolumn,yyline, new String(yytext())); }
"," {return new Symbol(tabla_simbolos2.tcom, yycolumn,yyline, new String(yytext())); }
"=" {return new Symbol(tabla_simbolos2.tigual, yycolumn,yyline, new String(yytext())); }
/* NUMEROS */
{numero} {return new Symbol(tabla_simbolos2.tnumero, yycolumn,yyline,new String(yytext()));}
/* PALABRAS */
{lnombre} {return new Symbol(tabla_simbolos2.tlnombre, yycolumn,yyline,new String(yytext()));}
/* BLANCOS */
[ \t\r\f\n]+ { /* Se ignoran */}
/* CUAQUIER OTRO */
. { System.out.println("Error Lexico en la columna: "+yycolumn+" , y la linea: "+yyline+" Simbolo= "+yytext()); }