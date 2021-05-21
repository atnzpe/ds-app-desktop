package quesito5;

/**
 * Escreva um algoritmo para ler o número total de eleitores de um município, o
 * número de votos brancos, nulos e válidos. Calcular e escrever o percentual
 * que cada um representa em relação ao total de eleitores.
 *
 *
 * @author Gleyson Atanazio
 */
import java.util.Scanner;

public class Quesito5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int vBrancos, vNulos, vValidos;
        float pBrancos, pNulos, pValidos;

        System.out.println("Digite o Número de Votos Válidos: ");
        vValidos = input.nextInt();
        System.out.println("Digite o Número de Votos Brancos: ");
        vBrancos = input.nextInt();
        System.out.println("Digite o Número de Votos Nulos: ");
        vNulos = input.nextInt();



    }

}
