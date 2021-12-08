package br.com.generation;
/*
  Exemplo 03: colocar para o usuário definir a quantidade de galões
  
  */
import java.util.Scanner;

public class MotivacionalExemplo03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int galoes;
		double litros ;					
		
		System.out.println("Quantos Galões ? ");
		galoes = leia.nextInt();
		
		litros = galoes * 3.7;
		
		System.out.println(galoes + " Galoes é " + litros + " litros");
		
		leia.close();
	}

}
