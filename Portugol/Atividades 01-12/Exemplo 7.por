programa
{
	/* 7) Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.

*/
	
	funcao inicio()
	{
		real altura, base, area

			escreva("Altura? ")
			leia(altura)

			escreva("Base? ")
			leia(base)

					area = (altura*base)/2
		
		 se(area >=0)
		 {		escreva("O valor da area é :", area)
		 	}
		
		senao {
			escreva("Altura ou base invalido")
			}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 411; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */