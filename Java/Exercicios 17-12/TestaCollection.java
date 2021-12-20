package AtividadesCollection;

import java.util.ArrayList;

public class TestaCollection {

	public static void main(String[] args) {
		ArrayList<Double> estoque = new ArrayList<>();

		double valores1 = 2500;
		double valores2 = 3500;
		double valores3 = 2650;

		estoque.add(valores1);
		estoque.add(valores2);
		estoque.add(valores3);

		for (double i : estoque) {
			System.out.println("Valor :" + i);
		}
		double PrimeiraCompra = estoque.get(0);
		System.out.println("Valor da primeira compra : " + PrimeiraCompra);

		for (int i = 0; i < estoque.size(); i++) {
			System.out.println("Valores em estoque :" + estoque.get(i));

		}
		estoque.set(0, 2700.00);

		for (int i = 0; i < estoque.size(); i++) {
			System.out.println("Valores em estoque :" + estoque.get(i));

		}
	}
}
