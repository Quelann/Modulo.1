package AtividadesCollection;

public class TestaAnimal {

	public static void main(String[] args) {

		Animal an = new Animal();
		Cavalo cv = new Cavalo();
		Cachorro ch = new Cachorro();
		Preguica pr = new Preguica();

		EmissaoSom(an);
		EmissaoSom(cv);
		EmissaoSom(ch);
		EmissaoSom(pr);
	}

	static void EmissaoSom(Animal animal) {
		System.out.println(animal.emitirSom());

	}
}
