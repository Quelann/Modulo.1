package LaçosCondicionais;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nt1, nt2 , mda ;
		
		//Entrada de dados
		System.out.println("Digite a primeira nota: ");
		nt1 = leia.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nt2 = leia.nextDouble();
		
		//Progresso 
		mda= nt1 + nt2 / 2 ;
		
		/*if = se
		 else if = senao se
		 else = senao		
		*/
		
		if(mda >= 7.0) {
			System.out.println("Aprovado." + "\nMédia " + mda);
		}
			
		else if(mda >= 4.0 && mda< 6.0) {
			System.out.println("Recuperação." + "\nMédia " + mda);
				}
		
		else {
			System.out.println("Reporvado." + "\nMédia " + mda);
		}
		
		leia.close();
	}

}
