SET JAVA_HOME="C:\Program Files\Java\jdk1.8.0_31\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd C:\Users\Bryan\Documents\Auxiliatura\Laboratorio de Compiladores 1 1er
semestre\Documentos\Manual de JFLEX y CUP\Escaner\src\Parsers
java -jar c:\Fuentes\java-cup-11b.jar -parser sintactico_4 -symbols tabla_simbolos4 Parser_4.cup
pause