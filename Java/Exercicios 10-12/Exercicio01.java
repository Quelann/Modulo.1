package Exercicios;
/*
 * 1- Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)
*/
public class Exercicio01 {

	public static void main(String[] args) {
		
		int rest;
		
		for(int num = 1000 ; num <= 1999 ; num++) {
			rest = num % 11 ;
					
			if (rest == 5) {
				System.out.println(num);
			}
			
		}
	}
}
