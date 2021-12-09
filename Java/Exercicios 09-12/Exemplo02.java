package LaçosCondicionais;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in); // ctrl,shit, O = Importar direto
	
	double n1, n2, result = 0.0;
	char operacao;						//Char = Caracter
	
	System.out.println("Digite o primeiro número: ");
	n1 = ler.nextDouble();
	
	System.out.println("Digite a operação: ");
	operacao = ler.next().charAt(0);
	
	System.out.println("Digite o segundo número: ");
	n2 = ler.nextDouble();
	
	if(operacao == '+') {
		result = n1 + n2;
	}
	
	else if(operacao == '-') {
		result = n1 - n2;
	}
	
	else if(operacao == '*' || operacao == 'x') {
		result = n1 * n2;
	}
	
	else if(operacao == '/') {
		result = n1 / n1;
	}
	
	System.out.println("Resultado da sua conta: " + result);
	
	ler.close();
	
	}

}
