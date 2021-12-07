programa
{
	/* Exercícios com Vetores[ ] e Matrizes [ ][ ]
	 	2.Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
	que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
	imprima a média aritmética dos lançamentos, contabilize e apresente também
	quantas foram as ocorrências da maior pontuação.*/

			inclua biblioteca Util
			
	funcao inicio()
	{
		inteiro dado[10]
		inteiro maiorPont=0,medAri,soma = 0,maior = 0, x
/*
medAri=média aritmética
maiorPont=maior pontuação

*/
	para(x = 0; x <=9 ; x++)
		{ dado[x] = Util.sorteia(1,6)
		
		soma = soma + dado[x]
		
		se(dado[x] > maior)
			{maior = dado[x]
			}
		escreva("\n",x+1," - Lançamento: ", dado[x])
		}

		para(x = 0 ; x <= 9; x++)
		{se(maior == dado[x])
			{maiorPont++
			}
			
		}
	medAri = soma / 10 
	escreva("\nMédia Aritmética: ", medAri)
	escreva("\nMaior : ",maiorPont," Vezes")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 793; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {dado, 13, 10, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */