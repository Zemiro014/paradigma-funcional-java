package br.com.application;

import java.util.function.UnaryOperator;

public class Imutabilidade {

	/*
	 * No paradigma funcional a imutabilidade diz que: uma vez que uma variável que recebeu um valor, vai possuir esse valor para sempre
	 *  Ou quando criamos um objecto ele não pode ser modificado
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor = 20; // Se por acaso eu quiser alterar o valor desta variável dentro da minha função Lambda, não me será permitido
		
		// UnaryOperator<Integer> retornarDobro = v -> {valor = 30; return v * 2;}; // Não é permitido alterar o valor de uma variável dentro de uma função Lambda.
		
		UnaryOperator<Integer> retornarDobro = v ->  v * 2;
		
		valor = 30; // Permitido por ele estar forra da minha função Lambda "UnaryOperator<Integer> retornarDobro = v -> v * 2; "
		
		System.out.println(retornarDobro.apply(valor));
		System.out.println(valor);
	}

}
