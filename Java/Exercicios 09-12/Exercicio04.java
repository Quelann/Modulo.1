package LaçosCondicionais;

import java.util.Scanner;

/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
  */

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		double imp, par, num;
		
		System.out.println("Digite um numero: ");
		num = leia.nextDouble();
		
		if(num % 2 == 0){
			par = Math.sqrt(num);
			System.out.print("O valor e par: " + par);
		}
		else {
			imp = Math.pow(num, 2);		
			System.out.print("O valor e impar: " + imp);
		}
		
		leia.close();
	}

}
