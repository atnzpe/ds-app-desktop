package quesito7;

import java.util.Scanner;

public class Quesito7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Qual a distância percorrida? ");
        double distancia = input.nextDouble();
        System.out.println("Quantos litros de combustível gastou? ");
        double combustivel = input.nextDouble();
        double consumoMedio = distancia / combustivel;
        System.out.printf("O consumo médio é de %.2f Km/l ", consumoMedio);
    }

}
