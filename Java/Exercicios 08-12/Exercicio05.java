package Exercicios01;

import java.util.Scanner;

/*
  5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5
respectivamente.
  */

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nt1, nt2, nt3, media;
		
		System.out.println("Escreva primeira nota: ");
		nt1 = leia.nextDouble();
		
		System.out.println("Escreva a segunda nota: ");
		nt2 = leia.nextDouble();
		
		System.out.println("Escreva a outra nota: ");;
		nt3 = leia.nextDouble();
		
		
		media = (nt1*2 + nt2*3 + nt3*5) / 6;
		
		System.out.println("Sua media �: " + media);
		
		leia.close();
			
			
	}

}
