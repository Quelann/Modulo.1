programa 
{
	/* 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.
	*/
	funcao inicio()
	{
		inteiro numero
		
		escreva("Digite um numero: ")
		leia(numero)

		se(numero % 2 == 0)
		
			se(numero >0)
			{	escreva("Número par positivo")
				}

			senao se(numero <0)
			{	escreva("Número par negativo")
				}

			senao{ escreva("Zero igual nulo")
				}
		
		senao{
			se(numero >0)
				escreva("Número impar positivo")

			senao
				escreva("Número impar negativo")		
						
	
		
	}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 335; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */