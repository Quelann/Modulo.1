package Exercicios01;

import java.util.Scanner;

/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

public class Exercicio03 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int hs , min ,seg , tSeg;	
		
		System.out.println("Quantos segundos tem o evento: ");
		tSeg = leia.nextInt();
		
		hs = tSeg / 3600;
		min = (tSeg % 3600) / 60;
		seg = (tSeg % 3600) % 60;
		
		System.out.println("\nA dura��o do evento em horas �: " + hs);
		System.out.println("\nA dura��o do evento em minutos � " + min);
		System.out.println("\nA duara��o do evento em segundos � " + seg);
					
		leia.close();

	}

}
