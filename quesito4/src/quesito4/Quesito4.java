/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quesito4;

import java.util.Scanner;

public class Quesito4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float base, altura;
        System.out.println("Digite a base: ");
        base = input.nextFloat();
        System.out.println("Digite a altura: ");
        altura = input.nextFloat();
        
        float area = base * altura;
        
        System.out.println(area+"m²");
        
    }

}
