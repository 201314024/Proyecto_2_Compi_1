package Parsers;
import java_cup.runtime.Symbol;
%%
lnumero=[0-9]
letra = [a-z]|[A-Z]
lnombre= {letra} ({lnumero}|{letra}|_)*
funcion= {lnombre}"(" (({letra}|{lnumero})+ ",")* ({letra}|{lnumero})+ ")"
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

/* SIMBOLOS */
"{" {return new Symbol(tabla_simbolos3.Ollave, yycolumn,yyline, new String(yytext())); }
"}" {return new Symbol(tabla_simbolos3.Cllave, yycolumn,yyline, new String(yytext())); }
"(" {return new Symbol(tabla_simbolos3.Oparen, yycolumn,yyline, new String(yytext())); }
")" {return new Symbol(tabla_simbolos3.Cparen, yycolumn,yyline, new String(yytext())); }
":" {return new Symbol(tabla_simbolos3.tpunts, yycolumn,yyline, new String(yytext())); }
"," {return new Symbol(tabla_simbolos3.tcom, yycolumn,yyline, new String(yytext())); }
/* NUMEROS */
{lnumero} {return new Symbol(tabla_simbolos3.tlnumero, yycolumn,yyline,new String(yytext()));}
/* PALABRAS */
{lnombre} {return new Symbol(tabla_simbolos3.tlnombre, yycolumn,yyline,new String(yytext()));}
/* PALABRAS RESERVADAS */
{funcion} {return new Symbol(tabla_simbolos3.tfunc, yycolumn,yyline, new String(yytext())); }
/* BLANCOS */
[ \t\r\f\n]+ { /* Se ignoran */}
/* CUAQUIER OTRO */
. { System.out.println("Error Lexico en: la columna: "+yycolumn+" , y la linea: "+yyline+" Simbolo="+yytext()); }