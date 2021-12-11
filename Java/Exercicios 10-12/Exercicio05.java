package Exercicios;

import java.util.Scanner;

/*
 * 5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
 * */

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("escreva um numero: ");
			num = input.nextInt();
			soma = num + soma ;
		}while(num != 0 );
		
		System.out.println(num);
		
		input.close();
	}

}
