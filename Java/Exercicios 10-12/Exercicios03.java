package Exercicios;

import java.util.Scanner;

/*
 * 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 * */
public class Exercicios03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		int menosid = 0,maisid = 0,idade = 0;
		
		while(idade != -99) {
			System.out.println("Digite uma idade ");
			idade = input.nextInt();
			if(idade < 21 && idade > 0) {
				menosid = menosid + 1;
			}			
			
			if(idade > 50 ) {
				maisid = maisid + 1;
			}
	}
	System.out.println("Total de pessoas com mais de 50 anos " + maisid);
	System.out.println("Total de pessoas com menos de 21 anos " + menosid);

	input.close();
	}
}
