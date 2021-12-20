package br.com.generation.classes;

public class Aviao {

	public String modelo;
	double comprimento, peso;
	boolean decolar;

	void escreverModelo() {
		System.out.println("Informe o modelo da aeronave: ");
	}

	void escreverComprimento() {
		System.out.println("Informe o comprimento da aeronave: ");
	}

	void escreverPeso() {
		System.out.println("Informe o peso da aeronave");
	}

	void liberarDecolagem(int confirmacao) {
		if (confirmacao == 1) {
			decolar = true;
			System.out.println("Permissão para decolar aprovada.");
		} else {
			decolar = false;
			System.out.println("Permissão para decolar negada.");
		}
	}
}