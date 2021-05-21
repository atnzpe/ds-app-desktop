/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quesito3;

import java.util.Scanner;

public class Quesito3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salarioBase;

        System.out.println("Qual o valor do Salário Base? ");
        salarioBase = input.nextDouble();

        double gratificacao = salarioBase * 0.05;
        double imposto = salarioBase * 0.03;
        double salarioFinal = (salarioBase-imposto) + gratificacao;
        
        System.out.println("O Salario Final é: R$ "+salarioFinal);

    }

}
