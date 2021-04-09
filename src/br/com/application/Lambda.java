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
		 * Trabalhar com esta forma � bastante verboa. Tu precisa cria a Interface, depois implementar ela e depois criar suas instancias
		 * */
		InterfaceFuncional1 function = valor -> valor;
	}
}

/*
 * Declarando uma interface funcional
 * */
@FunctionalInterface
interface InterfaceFuncional1{
	String gerarString(String valor);
}