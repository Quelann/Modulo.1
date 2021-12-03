programa
{
	/*Exercicio "ENQUANTO"
		1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
	apresente no final o total do somatório, a média e o total de valores lidos. O programa
	deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
	positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
	negativo.	
	
	*/
	funcao inicio()
	{
		real valor, somaValor = 0.0, mediaValor
		inteiro contValor = 0

		escreva("Leia o valor:")
		leia(valor)

		enquanto (valor >= 0){ //Enquanto o valor for maior que 0 some os demais dentro da variavel 
		
			somaValor = somaValor + valor  // quando eu quiser somar a variavel preciso descer as chaves 
			contValor++
			escreva("Digite um valor: ")
			leia(valor)		//---> -1
			}

		mediaValor = somaValor / contValor

		escreva("\nSomatório de valores: ", somaValor)
		escreva("\nMédia os valores: ", mediaValor)
		escreva("\nQuantidade de Valores lidos: ", contValor)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 977; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */