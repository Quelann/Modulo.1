programa
{
	/*Excercicio Para
		1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
	coletando dados sobre o salário e número de filhos. 
	A prefeitura deseja saber:  
	a) média do salário da população;
	b) média do número de filhos;
	c) maior salário;
	d) percentual de pessoas com salário até R$100,00.
	
	*/

	
	funcao inicio()
	{//chaves trabalhadas
		real salario, medSalario, percSalario
		real	somaSalario = 0.0
		real maiorSalario = 0.0
		inteiro filhos, medFilhos, populacao
		inteiro somaFilhos = 0
		inteiro contador = 0
		inteiro pop = 20


//desenvolver 
		para(inteiro c = 1; c <= pop; c++){
			escreva("Digite um salario: ")
			leia(salario)
			escreva("Quantos filhos: ")
			leia(filhos)
			
			somaSalario = somaSalario + salario
			
			somaFilhos = somaFilhos + filhos

			se(salario > maiorSalario) {
					maiorSalario = salario

					}
				se(salario <= 100) {
					contador = contador++
						}	
						}

						//Finalizar 
						
				medSalario = somaSalario / pop 
				medFilhos = somaFilhos / pop
				percSalario = (contador * 100) / pop
				escreva("A média salarial da população pesquisada é: R$ ", medSalario + "\n")
				escreva("A média de filhos da população pesquisada é: ", medFilhos + "\n")
				escreva("O maior salario da população pesquisada é: R$ ", maiorSalario + "\n")
				escreva("O percentual de pessoas com salario ate R$100 é: ", percSalario + "%\n")
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 973; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */