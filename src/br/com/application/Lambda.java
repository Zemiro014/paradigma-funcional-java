package br.com.application;

/*
 *  Ser� demonstrado como fazer uso da express�o Lambda
 *  
 *  A express�o Lambda "->" somente � usado no paradigma funcional, ou seja em uma class normal n�o se pode usar a express�o Lambda.
 *  
 *  Para sermos capaz de usar Lambdas em nossas classes precisamos declarar Interfaces Funcional. 
 *  Uma Interface � funcional se ela tiver apenas 1 m�todo abstract ou se tiver uma declara��o ( @FunctionalInterface) a n�vel de class
 *  
 *  Uma Interface funcional obrigatoria deve ter apenas 1 m�todo abstract
 * */
public class Lambda {

	public static void main(String[] args) {
		
		/*
		 * Quando voc� usa o Lambda ele autom�ticamente saber� qual o tipo de retorno da fun��o 
		 * */
		InterfaceFuncional1 function = valor -> "Sr. "+ valor; // Pega o valor e retorne ele para concarenado com "Sr."
		System.out.println(function.gerarString("Jer�nimo"));
		
		InterfaceFuncional2 function2 = valor -> System.out.println(valor); // Nesta condi��o n�o existe retorno. Isso porque o m�todo em quest�o � "void"
		function2.gerarString("Jer�nimo");
	}
}

/*
 * Declarando uma interface funcional
 * */
@FunctionalInterface
interface InterfaceFuncional1{
	String gerarString(String valor);
}

@FunctionalInterface
interface InterfaceFuncional2{
	void gerarString(String valor);
}