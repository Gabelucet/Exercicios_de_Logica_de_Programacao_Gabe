
//Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
import java.util.Scanner;

public class AtividadeTrinta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numeroUm, numeroDois, numeroTres;
        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {
            System.out.println( "\nVocê devrá informar três números inteiros distintos e irei te informar qual é a ordem crescente entre eles");
            System.out.print("Me informe o primeiro número: ");
            numeroUm = ler.nextInt();
            System.out.print("Me informe o segundo número: ");
            numeroDois = ler.nextInt();
            System.out.print("Me informe o terceiro número: ");
            numeroTres = ler.nextInt();

            if (numeroUm < numeroDois && numeroUm < numeroTres && numeroDois < numeroTres) {
                System.out.println("A ordem crescente dos números que você informou é: " + numeroUm + ", " + numeroDois + ", e " + numeroTres);
            } else {

                if (numeroUm < numeroDois && numeroUm < numeroTres && numeroTres < numeroDois) {
                    System.out.println("A ordem crescente dos números que você informou é: " + numeroUm + ", " + numeroTres + ", e " + numeroDois);
                }
                if (numeroDois < numeroUm && numeroDois < numeroTres && numeroUm < numeroTres) {
                    System.out.println("A ordem crescente dos números que você informou é: " + numeroDois + ", " + numeroUm + ", e " + numeroTres);
                }

                if (numeroDois < numeroUm && numeroDois < numeroTres && numeroTres < numeroUm) {
                    System.out.println("A ordem crescente dos números que você informou é: " + numeroDois + ", "+ numeroTres + ", e " + numeroUm);
                }

                if (numeroTres < numeroUm && numeroTres < numeroDois && numeroDois < numeroUm) {
                    System.out.println("A ordem crescente dos números que você informou é: " + numeroTres + ", "+ numeroDois + ", e " + numeroUm);
                }
                if (numeroTres < numeroUm && numeroTres < numeroDois && numeroUm < numeroDois) {
                    System.out.println("A ordem crescente dos números que você informou é: " + numeroTres + ", " + numeroUm+ ", e " + numeroDois);
                }
            }
            // SABER SE O CLIENTE QUER PARAR OU CONTINUAR
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
