package br.com.generation;

import java.util.Scanner;

public class MotivacionalExemplo04 {
	/*
	 Exemplo 04: fazer a subtração, divisão, multiplicação e resto da divisão 
	 */

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
		double n1,n2, result ;		
		
		
		//Adiação
		System.out.println("Digite valor A: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o valor B: ");
		n2 = leia.nextDouble();
			
		result = n1 + n2;
		
		System.out.println("Soma adição: " + result);
		
		
		//Subtração
		System.out.println("Digite valor A: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o valor B: ");
		n2 = leia.nextDouble();
		
		result = n1 - n2;
	
		System.out.println("Resultado multiplicação: " + result);
		
	
		//Multiplicação
		System.out.println("Digite valor A: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o valor B: ");
		n2 = leia.nextDouble();
		
		result = n1 * n2;
		
		System.out.println("Resultado Multiplicação: " + result);		
		
		
		//Divisão
		System.out.println("Digite valor A: ");
		n1 = leia.nextDouble();
				
		System.out.println("Digite o valor B: ");
		n2 = leia.nextDouble();
				
		result = n1 / n2;
				
		System.out.println("Resultado Divisão: " + result);	
				
		//Resto da divisão
		
		System.out.println("Digite valor A: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o valor B: ");
		n2 = leia.nextDouble();
		
		result = n1 % n2;
		
		System.out.println("Resultado resto da divisão: " + result);
		
		leia.close();
				
	
	}

}
