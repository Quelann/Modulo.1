programa{

	/*Exercícios com Vetores[ ] e Matrizes [ ][ ]
		4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
	em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
	diagonal, ou seja, diagonal principal.
		*/
	
	funcao inicio()
	{
		inteiro val [3][3]
		inteiro somaTotal = 0, somaDiagonal = 0

	para(inteiro l = 0; l < 3; l++)	//l= linha
		{		
		para(inteiro c = 0; c < 3; c++)   //c= coluna
			{	

				escreva("Digite os valores: ")
				leia(val[l][c])
						
		somaDiagonal = val [0] [0] + val [1] [1] + val [2] [2]	
		somaTotal += val [l] [c]
			}		
		}

		escreva("\nResultado diagonal: ", somaDiagonal)
		escreva("\nResultado Total3: ", somaTotal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 713; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {val, 11, 10, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */