# analisadorSintatico
Parte 2 do trabalho da disciplina de Compiladores

O Analisador Sintático foi feito baseado na gramática do trabalho 1, sobre o Analisador Léxico. 
Este analisa uma sequência de entrada da linguagem JAVA para determinar sua estrutura gramatical segundo uma determinada gramática. 

Para o analisador sintático funcionar (asfernanda.txt), é preciso que antes execute os seguintes passos no Windows:

1 - abrir o cmd 
2 - executar os seguintes comandos:
  * SET CLASSPATH=.;C:\Javalib\antlr-4.5-complete.jar;%CLASSPATH%
  * doskey antlr4=java org.antlr.v4.Tool $*
  * doskey grun =java org.antlr.v4.runtime.misc.TestRig $*
  * cd no diretório do analisador
  * antlr4 asfernanda.txt
  * javac asfernanda.java
  * grun asfernanda classe -gui // este comando pode mudar a palavra "classe" para qualquer outra definida no analisador. 
  
  
  
  
  
