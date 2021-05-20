/*
 * Escreva um algoritmo que leia o 
   salário fixo de um vendedor e o total de vendas efetuadas por ele no mês (em dinheiro). 
   Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas. 
   Exiba o salário fixo e o salário no final do mês.
 */
package quesito1;

import java.util.Scanner;

public class Quesito1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float salarioFixo;
        float vendasMes;
        double salarioFinal;
        double comissao;

        System.out.println("Qual o valor do Salário Fixo? ");
        salarioFixo = input.nextFloat();

        System.out.print("Qual o valor das Vendas do Mês? ");
        vendasMes = input.nextFloat();

        comissao = vendasMes * 0.15;
        salarioFinal = (comissao + salarioFixo);

        System.out.println("O salário fixo é de R$ " + salarioFixo + ", e o Salário Final é R$ " + salarioFinal);
    }

}
