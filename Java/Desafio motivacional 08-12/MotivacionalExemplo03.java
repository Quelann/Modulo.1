package br.com.generation;
/*
  Exemplo 03: colocar para o usu�rio definir a quantidade de gal�es
  
  */
import java.util.Scanner;

public class MotivacionalExemplo03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int galoes;
		double litros ;					
		
		System.out.println("Quantos Gal�es ? ");
		galoes = leia.nextInt();
		
		litros = galoes * 3.7;
		
		System.out.println(galoes + " Galoes � " + litros + " litros");
		
		leia.close();
	}

}
