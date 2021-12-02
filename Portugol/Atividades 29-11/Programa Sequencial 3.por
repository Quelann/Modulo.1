programa
{
	
	funcao inicio() {

	inteiro horas
	inteiro minutos 
	inteiro segundos 
	inteiro totalSegundos

	escreva("Quantos segundos tem o evento? :")
	leia(totalSegundos)

	horas = totalSegundos/3600 
	minutos = (totalSegundos%3600)/60
	segundos = (totalSegundos%3600)%60
	
	escreva("\nA duração do evento em horas é : ", horas)
	escreva("\nA duração do evento em minutos é : ",minutos)
	escreva("\nA duração do evento em segundos é : ", segundos)

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 457; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */