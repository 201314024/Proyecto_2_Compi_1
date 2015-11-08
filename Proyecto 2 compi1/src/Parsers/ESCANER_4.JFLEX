package Parsers;
import java_cup.runtime.Symbol;
%%
lnumero=[0-9]
numero={lnumero}+
letra = [a-z]|[A-Z]
lnombre= {letra} ({lnumero}|{letra}|_)*
coment= "$" ({lnombre} " "?)+ "$"
funcion= {lnombre}"(" (({letra}|{lnumero})+ ",")* ({letra}|{lnumero})+ ")"
%cupsym tabla_simbolos3
%class lexico_4
%cup
%public
%unicode
%line
%column
%char
%ignorecase
%%

/* SIMBOLOS */
"{" {return new Symbol(tabla_simbolos4.Ollave, yycolumn,yyline, new String(yytext())); }
"}" {return new Symbol(tabla_simbolos4.Cllave, yycolumn,yyline, new String(yytext())); }
"[" {return new Symbol(tabla_simbolos4.OCorch, yycolumn,yyline, new String(yytext())); }
"]" {return new Symbol(tabla_simbolos4.CCorch, yycolumn,yyline, new String(yytext())); }
"(" {return new Symbol(tabla_simbolos4.Oparen, yycolumn,yyline, new String(yytext())); }
")" {return new Symbol(tabla_simbolos4.Cparen, yycolumn,yyline, new String(yytext())); }
":" {return new Symbol(tabla_simbolos4.tpunts, yycolumn,yyline, new String(yytext())); }
"," {return new Symbol(tabla_simbolos4.tcom, yycolumn,yyline, new String(yytext())); }
"+" {return new Symbol(tabla_simbolos4.tmas, yycolumn,yyline, new String(yytext())); }
"-" {return new Symbol(tabla_simbolos4.tmen, yycolumn,yyline, new String(yytext())); }
"*" {return new Symbol(tabla_simbolos4.tpor, yycolumn,yyline, new String(yytext())); }
"/" {return new Symbol(tabla_simbolos4.tdiv, yycolumn,yyline, new String(yytext())); }
">" {return new Symbol(tabla_simbolos4.tmay, yycolumn,yyline, new String(yytext())); }
"<" {return new Symbol(tabla_simbolos4.tmeno, yycolumn,yyline, new String(yytext())); }
"=" {return new Symbol(tabla_simbolos4.tigual, yycolumn,yyline, new String(yytext())); }
"==" {return new Symbol(tabla_simbolos4.tiguala, yycolumn,yyline, new String(yytext())); }
";" {return new Symbol(tabla_simbolos4.tpuntycom, yycolumn,yyline, new String(yytext())); }
/* NUMEROS */
{numero} {return new Symbol(tabla_simbolos4.tnumero, yycolumn,yyline,new String(yytext()));}
/* PALABRAS */
{lnombre} {return new Symbol(tabla_simbolos4.tlnombre, yycolumn,yyline,new String(yytext()));}
/* PALABRAS RESERVADAS */
"funciones" {return new Symbol(tabla_simbolos4.tfunc, yycolumn,yyline, new String(yytext())); }
"return" {return new Symbol(tabla_simbolos4.tret, yycolumn,yyline, new String(yytext())); }
"if" {return new Symbol(tabla_simbolos4.tif, yycolumn,yyline, new String(yytext())); }
"while" {return new Symbol(tabla_simbolos4.twhile, yycolumn,yyline, new String(yytext())); }
"for" {return new Symbol(tabla_simbolos4.tfor, yycolumn,yyline, new String(yytext())); }
"new" {return new Symbol(tabla_simbolos4.tnew, yycolumn,yyline, new String(yytext())); }
"entero" {return new Symbol(tabla_simbolos4.tentero, yycolumn,yyline, new String(yytext())); }
{coment} {return new Symbol(tabla_simbolos4.tcoment, yycolumn,yyline, new String(yytext())); }
/* BLANCOS */
[ \t\r\f\n]+ { /* Se ignoran */}
/* CUAQUIER OTRO */
. { System.out.println("Error Lexico en: la columna: "+yycolumn+" , y la linea: "+yyline+" Simbolo="+yytext()); }