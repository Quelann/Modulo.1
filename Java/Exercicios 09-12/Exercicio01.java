package ExercicioLa�os;

import java.util.Scanner;

/*01.Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */
public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Escreva o primeiro n�mero: ");
		n1 = ler.nextInt();
		
		System.out.println("Escreva o segundo n�mero: ");
		n2 = ler.nextInt();
		
		System.out.println("Escreva o terceiro n�mero: ");
		n3 = ler.nextInt();
		
				
		if (n1 > n2 && n2 > n3){
			System.out.println("O numero maior e: " + n1);			
		}
		
		else if(n2 > n3 && n1 > n3) {
			System.out.println("O numero maior e: " + n2);
		}
		
		else {
			System.out.println("O numero maior e: " + n3);
		}

		ler.close();
	}

}
