package br.com.generation;

import java.util.Scanner;

public class MotivacionalExemplo04 {
	/*
	 Exemplo 04: fazer a subtra��o, divis�o, multiplica��o e resto da divis�o 
	 */

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
		double n1,n2, result ;		
		
		
		//Adia��o
		System.out.println("Digite valor A: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o valor B: ");
		n2 = leia.nextDouble();
			
		result = n1 + n2;
		
		System.out.println("Soma adi��o: " + result);
		
		
		//Subtra��o
		System.out.println("Digite valor A: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o valor B: ");
		n2 = leia.nextDouble();
		
		result = n1 - n2;
	
		System.out.println("Resultado multiplica��o: " + result);
		
	
		//Multiplica��o
		System.out.println("Digite valor A: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o valor B: ");
		n2 = leia.nextDouble();
		
		result = n1 * n2;
		
		System.out.println("Resultado Multiplica��o: " + result);		
		
		
		//Divis�o
		System.out.println("Digite valor A: ");
		n1 = leia.nextDouble();
				
		System.out.println("Digite o valor B: ");
		n2 = leia.nextDouble();
				
		result = n1 / n2;
				
		System.out.println("Resultado Divis�o: " + result);	
				
		//Resto da divis�o
		
		System.out.println("Digite valor A: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o valor B: ");
		n2 = leia.nextDouble();
		
		result = n1 % n2;
		
		System.out.println("Resultado resto da divis�o: " + result);
		
		leia.close();
				
	
	}

}
