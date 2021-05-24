package quesito6;

import java.util.Scanner;

public class Quesito6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o tamanho do arquivo em Megabytes? ");
        double tamanhoArquivo = input.nextFloat();
        double tMegabyte = 0.17;
        double tTransferencia = tamanhoArquivo * tMegabyte;

        System.out.printf("Para tranferir %.2f MB, você levará %.2f minutos", tamanhoArquivo, tTransferencia);

    }

}
