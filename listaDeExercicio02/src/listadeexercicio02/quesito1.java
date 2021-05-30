/*********************************************************
 * Ler 3 números fracionários do teclado e informar se:  *
 * O primeiro é maior do que a soma dos dois últimos;    *
 * Criado por Gleyson Atanazio em 30/05/2021             *
 *********************************************************
 */
package listadeexercicio02;

import java.util.Scanner;

public class quesito1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero fracionado. Ex: 1,3. ");
        double n1 = input.nextDouble();
        System.out.println("Digite um segundo numero fracionario. ");
        double n2 = input.nextDouble();
        System.out.println("Por fim Digite um terceiro número. ");
        double n3 = input.nextDouble();

        double soma = n2 + n3;

        if (n1 > soma) {
            System.out.println("Primeiro número maior que a soma dos dois últimos números. ");
        } else {
            System.out.println("Primeiro número não é maior que a soma dos dois últimos. ");
        }
    }

}
