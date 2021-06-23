programa
{
	
	funcao inicio()
	{
		inteiro idade,empregoFormal, statusBeneficioAssistencial, codigoAtividade,nPessoas
		real rendaFamiliarTotal
		
		escreva("Você é maior de 18 anos? ","\n","Digite '0' para NÃO ou '1' para SIM. ")
		leia(idade)

		escreva("Você Tem emprego formal? Digite '0' para NÃO ou '1' para SIM. ")
		leia(empregoFormal)

		escreva("Você recebe algum benefício previdenciário ou assistencial, "
                ,"\n","seguro-desemprego ou de outro programa de transferência de renda federal "
                ,"\n","que não seja o Bolsa Família.? Digite '0' para NÃO ou '1' para SIM. ")
          leia(statusBeneficioAssistencial)

          escreva("Você está desempregado ou exercer atividade na condição de:"
                ,"\n"," microempreendedor individual (MEI) ou"
               ,"\n"," é contribuinte individual ou facultativo do Regime Geral de Previdência Social (RGPS) "
                ,"\n","ou trabalhador informal inscrito no Cadastro Único para Programas Sociais do Governo Federal (CadÚnico).?"
                ,"\n","Digite '0' para NÃO ou '1' para SIM. ")
          leia(codigoAtividade)

          escreva("Qual o número de pessoas que moram na sua casa? ")
          leia(nPessoas)

          escreva("Qual o valor total recebido pela família? "
                ,"\n","Informe quanto a familia recebe incluindo você. ")
          leia(rendaFamiliarTotal)

          real rendaPessoa = rendaFamiliarTotal / nPessoas

          limpa()
		
		se (idade == 1 e empregoFormal == 0) {          	
          		se (codigoAtividade == 1 e statusBeneficioAssistencial == 0){
          			se  (rendaPessoa <= 550 e rendaFamiliarTotal <= 3300){
          				escreva("Parabéns! Você foi contemplado e receberá XXX.XX reais")
          			}
          		}
          	}
          	senao{
          		escreva("Benefício Assistencial Reprovado!")
          	}
      	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1487; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */