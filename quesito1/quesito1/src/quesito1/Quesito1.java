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

        double salarioFinal, vendasMes, salarioFixo;

        System.out.println("Qual o valor do Salário Fixo? ");
        salarioFixo = input.nextDouble();

        System.out.println("Qual o valor das Vendas do Mês? ");
        vendasMes = input.nextDouble();

        salarioFinal = vendasMes * 0.15 + salarioFixo;

        System.out.printf("O salário fixo é de R$ %.2f, e o Salário Final é R$ %.2f%n", salarioFixo, salarioFinal);

    }

}
