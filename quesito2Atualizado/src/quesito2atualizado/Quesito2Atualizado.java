package quesito2atualizado;

import java.util.Scanner;

/**
 * Ler uma temperatura em graus Celsius e apresenta-la em Fahrenheit. A fórmula
 * de conversão é: F=(9*C+160)/5, sendo F Fahrenheit e C Celsius.
 *
 * @author gleyson
 */
public class Quesito2Atualizado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float celsius;
        float fahrenheit;

        System.out.println("Digite a temperatura em graus Celsius");
        celsius = input.nextFloat();
        fahrenheit = (9 * celsius + 160) / 5;
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
    }

}
