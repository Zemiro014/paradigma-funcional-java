package br.com.application;

/*
 *  Será demonstrado como fazer uso da expressão Lambda
 *  
 *  A expressão Lambda "->" somente é usado no paradigma funcional, ou seja em uma class normal não se pode usar a expressão Lambda.
 *  
 *  Para sermos capaz de usar Lambdas em nossas classes precisamos declarar Interfaces Funcional. 
 *  Uma Interface é funcional se ela tiver apenas 1 método abstract ou se tiver uma declaração ( @FunctionalInterface) a nível de class
 *  
 *  Uma Interface funcional obrigatoria deve ter apenas 1 método abstract
 * */
public class Lambda {

	public static void main(String[] args) {
		
		/*
		 * Quando você usa o Lambda ele automáticamente saberá qual o tipo de retorno da função 
		 * */
		InterfaceFuncional1 function = valor -> "Sr. "+ valor; // Pega o valor e retorne ele para concarenado com "Sr."
		System.out.println(function.gerarString("Jerónimo"));
		
		InterfaceFuncional2 function2 = valor -> System.out.println(valor); // Nesta condição não existe retorno. Isso porque o método em questão é "void"
		function2.gerarString("Jerónimo");
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