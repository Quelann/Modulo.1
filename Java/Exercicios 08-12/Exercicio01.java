package Exercicios01;

import java.util.Scanner;

/*
 	1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.
  */

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, tDias;
		
		System.out.println("Ola quantos anos voc� tem? ");
		anos = leia.nextInt();
		
		System.out.println("\nQuantos meses de vida voc� tem? ");
		meses = leia.nextInt();
		
		System.out.println("\nQuantos dias de vida voc� tem? ");
		dias = leia.nextInt();
		
		tDias = anos*365 + meses*30 + dias;
				
				System.out.println("\nSua idade em dias �: " + tDias);
		leia.close();
		
	}

}
