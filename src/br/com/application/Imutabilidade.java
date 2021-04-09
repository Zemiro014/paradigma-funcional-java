package br.com.application;

import java.util.function.UnaryOperator;

public class Imutabilidade {

	/*
	 * No paradigma funcional a imutabilidade diz que: uma vez que uma vari�vel que recebeu um valor, vai possuir esse valor para sempre
	 *  Ou quando criamos um objecto ele n�o pode ser modificado
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor = 20; // Se por acaso eu quiser alterar o valor desta vari�vel dentro da minha fun��o Lambda, n�o me ser� permitido
		
		// UnaryOperator<Integer> retornarDobro = v -> {valor = 30; return v * 2;}; // N�o � permitido alterar o valor de uma vari�vel dentro de uma fun��o Lambda.
		
		UnaryOperator<Integer> retornarDobro = v ->  v * 2;
		
		valor = 30; // Permitido por ele estar forra da minha fun��o Lambda "UnaryOperator<Integer> retornarDobro = v -> v * 2; "
		
		System.out.println(retornarDobro.apply(valor));
		System.out.println(valor);
	}

}
