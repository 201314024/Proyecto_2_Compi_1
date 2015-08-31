SET JAVA_HOME="C:\Program Files\Java\jdk1.8.0_31\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
SET JFLEX_HOME= C:\Fuentes\jflex-1.6.1
cd C:\Users\Bryan\Documents\Auxiliatura\Laboratorio de Compiladores 1 1er
semestre\Documentos\Manual de JFLEX y CUP\Escaner\src\Parsers
java -jar %JFLEX_HOME%\lib\jflex-1.6.1.jar Escaner_3.jflex
pause