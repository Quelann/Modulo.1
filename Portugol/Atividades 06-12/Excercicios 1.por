programa
{
	/* Exercícios com Vetores[ ] e Matrizes [ ][ ]
		1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
	atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.	
	*/
	
	funcao inicio()
	{
		inteiro ativ[5]
		inteiro numMaior=0, x
		
		
		para(x = 0 ; x < 5 ;x++ )
		{
			escreva("Escreva sua nota:")
			leia(ativ[x])

			se(ativ[x] > numMaior )
				{
				numMaior= ativ[x]
				}

		}

			escreva("A maior pontuação: ", numMaior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 449; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */