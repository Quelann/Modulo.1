package Exercicios01;

import java.util.Scanner;

/*
 * 7. Um sistema de equações lineares do tipo:
, pode ser resolvido segundo mostrado abaixo :
Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.
 * */

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a,b,c,d,e,f,x,y;
		
		System.out.println("Digite A: ");
		a = leia.nextDouble();
		System.out.println("Digite B: ");
		b = leia.nextDouble();
		System.out.println("Digite C: ");
		c = leia.nextDouble();
		System.out.println("Digite D: ");
		d = leia.nextDouble();
		System.out.println("Digite E: ");
		e = leia.nextDouble();
		System.out.println("Digite F: ");
		f = leia.nextDouble();
		
		
		x = ((c*e) - (b*f)) / ((a*e) - (b*d));
		y = ((a*f) - (c*a)) / ((a*e) - (b*d));
		
				
		System.out.println("Equação X = " + x + " \n");
		System.out.println("Equação Y = " + y);
		
		leia.close();
		
	}
}
