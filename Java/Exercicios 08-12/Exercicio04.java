package Exercicios01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
				
		Scanner leia = new Scanner(System.in);
		
		double a,b,c,d,r,s;
		
		System.out.println("Atribua o valor para A: ");
		a = leia.nextDouble();
		
		System.out.println("Atribua o valor para B: ");
		b = leia.nextDouble();
		
		System.out.println("Atribua o valor para C: ");
		c = leia.nextDouble();
		
		r = Math.pow((a + b),2);
		s = Math.pow((b + c),2);
		d = (r + s) / 2;
		
		System.out.println("Valor de R �: " + r);
		System.out.println("Valor de S �: " + s);
		System.out.println("Valor de D �: " + d);
		
		leia.close();
		
	}

}
