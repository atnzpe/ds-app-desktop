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

        System.out.println("Houveram quantos Votos Válidos? ");
        vValidos = input.nextInt();
        System.out.println("Quantos Votos Brancos? ");
        vBrancos = input.nextInt();
        System.out.println("Por fim, quantos votos Nulos? ");
        vNulos = input.nextInt();

        int totalEleitores = vBrancos + vNulos + vValidos;

        float pBrancos = (vBrancos * 100) / totalEleitores;
        float pNulos = (vNulos * 100) / totalEleitores;
        float pValidos = (vValidos * 100) / totalEleitores;

        System.out.println("Total de Votos: " + totalEleitores);
        System.out.println("Votos Válidos : " + vValidos + " representa " + pValidos + "%");
        System.out.println("Votos Brancos : " + vBrancos + " representa " + pBrancos + "%");
        System.out.println("Votos Nulos : " + vNulos + " representa " + pNulos + "%");

    }

}
