package La�osCondicionais;

import java.util.Scanner;

/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
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
