package ExercicioLaços;

import java.util.Scanner;

/*
  2- Faça um programa que entre com três números e coloque em ordem crescente.
  */

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Escreva o primeiro numero: ");
		n1 = ler.nextInt();
		
		System.out.println("Escreva o segundo numero: ");
		n2 = ler.nextInt();
		
		System.out.println("Escreva o terceiro numero: ");
		n3 = ler.nextInt();
		
		 if(n1 <= n2 && n2 <=3){
			 System.out.println("Ordem crescente: " +n1+" "+ n2 +" "+ n3);
			 }
		 else if(n1 <= n3 && n3 <= n2){
			 System.out.println("Ordem crescente: " +n1+" "+ n3 +" "+ n2);
			 }
			 
		else if(n2<= n1 && n1<= n3){
			 System.out.println("Ordem crescente: " +n2+" "+ n1 +" "+ n3);
			 }
			 
		else if(n2<= n3 && n3 <= n1){
			 System.out.println("Ordem crescente: " +n2+" "+ n3 +" "+ n1);
			 }
			 
		else if(n3 <= n1 && n1 <=n2){
			 System.out.println("Ordem crescente: " +n3+" "+ n1 +" "+ n2);
			 }
		else {
			System.out.println("Ordem crescente: " +n3+" "+ n2 +" "+ n1);
		}
		
		ler.close();
	}

}
