package Exercicios01;

import java.util.Scanner;

/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
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
		
		System.out.println("\nA duração do evento em horas é: " + hs);
		System.out.println("\nA duração do evento em minutos é " + min);
		System.out.println("\nA duaração do evento em segundos é " + seg);
					
		leia.close();

	}

}
