package ExercicioLaços;

import java.util.Scanner;

/*01.Faça um programa que receba três inteiros e diga qual deles é o maior.
 */
public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Escreva o primeiro número: ");
		n1 = ler.nextInt();
		
		System.out.println("Escreva o segundo número: ");
		n2 = ler.nextInt();
		
		System.out.println("Escreva o terceiro número: ");
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
