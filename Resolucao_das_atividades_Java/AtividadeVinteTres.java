//Faça um algoritmo que receba um número e mostre uma mensagem caso este número sege maior que 80, menor que 25 ou igual a 40;

import java.util.Scanner;

public class AtividadeVinteTres {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        char continuar = 's';
        int numero = 0;

        while (continuar == 's' || continuar == 'S') {

            System.out.println("\nMe informe um número para analise: ");
            numero = ler.nextInt();

            if (numero > 80) {
                System.out.println("Esse número é maior que 80");
            }
            if (numero < 25) {
                System.out.println("Esse número é menor que 25");
            }
            if (numero == 40) {
                System.out.println("O número é igual a 40");
            }

            System.out.println(" Deseja continuar ? \n S - para Sim \n N - para Não");
            continuar = ler.next().charAt(0);

            switch (continuar) {
                case 'S':
                    continuar = 'S';
                    break;
                case 's':
                    continuar = 's';
                    break;
                case 'n':
                    continuar = 'n';
                    break;
                case 'N':
                    continuar = 'N';
                    break;
            }

        }
        ler.close();
    }

}
