package OrientaçãoaObjetos;

import java.util.Scanner;

public class Exercicio01main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Exercicio01 c1 = new Exercicio01();

		System.out.println("Dados do Cliente");
		System.out.printf("Nome: ");
		c1.setNome(input.nextLine());

		System.out.printf("Idade: ");
		c1.setIdade(input.nextLine());

		System.out.printf("Endereço: ");
		c1.setEndereco(input.nextLine());

		System.out.println();

		System.out.println("Nome: " + c1.getNome());
		System.out.println("Idade: " + c1.getIdade() + " Anos");
		System.out.println("Endereço: " + c1.getEndereco());

		input.close();
	}

}
