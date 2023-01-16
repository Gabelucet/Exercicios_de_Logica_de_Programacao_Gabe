//Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o maior, e uma mensagem que são diferentes;

import java.util.Scanner;

public class AtividadeVinteCinco {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        char desejaContinuar = 'S';
        int primeiroNumero = 0;
        int segundoNumero = 0;

        while (desejaContinuar == 's' || desejaContinuar == 'S') {

            System.out.println("\nMe informe o primeiro número, por favor :");
            primeiroNumero = ler.nextInt();
            System.out.println("Me informe o segundo número, por favor");
            segundoNumero = ler.nextInt();

            if (primeiroNumero == segundoNumero) {
                System.out.println("Esses números são iguais");
            } else {
                if (primeiroNumero > segundoNumero) {
                    System.out.println("O primeiro número é maior que o segundo número");
                } else {
                    System.out.println("O segundo número é maior que o primeiro");
                }

            }
            System.out.println("\nDeseja continuar ?\nS - para Sim \nN - para Não");
            desejaContinuar = ler.next().charAt(0);

            switch (desejaContinuar) {
                case 'S':
                    desejaContinuar = 'S';
                    break;
                case 's':
                    desejaContinuar = 's';
                    break;
                case 'N':
                    System.out.println("Tchau");
                    desejaContinuar = 'N';
                    break;
                case 'n':
                    System.out.println("Tchau");
                    desejaContinuar = 'n';
                    break;
            }

        }
        ler.close();
    }
}
