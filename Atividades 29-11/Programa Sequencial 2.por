programa
{
	
	funcao inicio()	{

	inteiro dias
	inteiro meses 
	inteiro anos 
	inteiro totalDias

	escreva("Quantos dias de vida você tem ?")
	leia(totalDias)

	anos  = totalDias/365
	meses = (totalDias % 365) / 30
	dias = (totalDias % 365) % 30
	
	escreva("\nSua idade em anos, é :", anos)
	escreva("\nSua idade em meses é :",meses)
	escreva("\nSua idade em dias é :", dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 338; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */