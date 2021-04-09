package br.com.application;

import java.util.ArrayList;
import java.util.List;

import br.com.application.model.Pessoa;

/*
 * Ser� demonstrado como buscar um valor espec�fico em uma lista usando paradigma funcional e do imperativo.
 * */
public class IterarLista {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();
		
		pessoas.add(new Pessoa("Jo�o", 1));
		pessoas.add(new Pessoa("Eduardo", 2));
		pessoas.add(new Pessoa("Tiago", 3));
		pessoas.add(new Pessoa("Maria", 4));
		pessoas.add(new Pessoa("Artur", 5));
		pessoas.add(new Pessoa("Paulo", 6));
		
		// Vamos simular a busca de um elemento espec�fico na nossa lista: Usando Lambda do paradigma funcional		
		pessoas.stream().filter(pessoa -> pessoa.getId()==3).forEach(pessoa -> System.out.println(pessoa));  // retornar� os dados do objecto que contem um id == 3
		
		
		// Usando paradigma imperativa
		for(Pessoa p : pessoas) {
			if(p.getId() == 3) {
				System.out.println(p);
			}
		}
		
		pessoas.stream().map(pessoa -> pessoa.getId()==2).forEach(pessoa -> System.out.println(pessoa)); // retornar� true para o objecto que contem um id == 2
		

	}

}
