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
		 * Trabalhar com esta forma é bastante verboa. Tu precisa cria a Interface, depois implementar ela e depois criar suas instancias
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