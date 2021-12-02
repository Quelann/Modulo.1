programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()	{

	inteiro A 
	inteiro B 
	inteiro C 
	inteiro D
	inteiro R
	inteiro S

	escreva("Atribua um valor para A: ")
	leia(A)
	
	escreva("Atribua um valor para B: ")
	leia(B)

	escreva("Atribua um valor para C: ")
	leia(C)
	

	R= mat.potencia((A + B), 2)
	S= mat.potencia(B+C, 2)
	D= (R+S)/2

	escreva("Valor de R é: ", R)
	escreva("\nValor de S é: ", S)
	escreva("\nValor de D é: ", D)


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 339; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */