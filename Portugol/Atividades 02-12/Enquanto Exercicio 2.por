programa
{
	/*Exercicio Enquanto 2
		2- Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por
	três (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário
	 5, deveremos observar na tela a seguinte sequência: 5 15 45 135.
	
	*/
	
	funcao inicio()
	{
		inteiro num // variavel

		escreva("Digite um número para ser multiplicado por 3: ") // Frase de efeito
		leia(num)

		enquanto(num < 100)		//onde se termina a limitação enquanto for meno 100 ele fara a conta
		{
			num = num * 3		
			escreva(num ,",")
		}			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 513; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */