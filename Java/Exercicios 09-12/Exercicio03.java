package LaçosCondicionais;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva uma letra de A até D: ");
		// cadeia nome = "Luiz Melin 123 @#$%"
		String letra = ler.nextLine();
		
		switch(letra) {
			case "a", "A":
				System.out.println("Ana");
				break;
				
			case "b", "B":
				System.out.println("Bruno");
				break;
				
			case "c", "C":
				System.out.println("Carlos");
				break;
				
			case "d", "D":
				System.out.println("Daniela");
				break;
		}
		
		ler.close();
		
		
	}

}
