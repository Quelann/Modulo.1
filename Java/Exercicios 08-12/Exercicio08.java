package Exercicios01;

import java.util.Scanner;

/*
  8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.
*/

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double vCar, vCarImp, vCarDis;
		
		System.out.println("Digite o valor do carro que deseja adquirir: ");
		vCar = leia.nextDouble();
		
		vCarDis = vCar + (vCar * 0.28);
		vCarImp = vCarDis + (vCarDis * 0.45);		
		
		System.out.println("O valor do carro com imposto mais a porcentangem do distribuidor � :R$" + vCarDis);
		System.out.println("O valor do carro com imposto � :R$" + vCarImp);
		
		leia.close();
		
	}

}
