package br.com.generation.classes;

/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Cliente {
	// Definir Atributos
	public String nome, cidade, estado;
	public int idade;
	
	void escreverNome() {
		System.out.print("Nome do cliente: ");
	}
	
	void escreverIdade() {
		System.out.print("\nDigite a idade: ");
	}
	
	void escreverCidade() {
		System.out.print("\nDigite a cidade: ");
	}
	
	void escreverEstado() {
		System.out.print("\nDigite o estado: ");
	}
}