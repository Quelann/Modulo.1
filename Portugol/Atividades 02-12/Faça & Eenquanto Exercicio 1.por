programa
{
	/*
	Exercicio 1 FAÇA&ENQUANTO

		1- Faça um programa que mostre uma contagem na tela de 233 a 456, só que
	contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
	
	*/
	funcao inicio()
	{
		inteiro numero = 233

		faca{
			se(numero >=233 e numero<=300)/*>= 233 numero de inicio ate igal ou menor "<="300*/ {
					numero = numero + 5				
					}
			senao se(numero >= 300 e numero <= 400){
					numero = numero + 3
					}
			senao se(numero >=400 e numero <=456){
					numero = numero + 5
					}
			escreva("\n Número:", numero)
				
			}

		enquanto(numero <=456)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 340; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */