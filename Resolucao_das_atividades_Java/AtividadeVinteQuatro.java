
//Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;
import java.util.Scanner;

public class AtividadeVinteQuatro {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero;
        char desejaContinuar = 's';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {

            System.out.println("\nMe informe o número que deseja analisar");
            numero = ler.nextInt();

            if (numero == 0) {
                System.out.println("Esse número é nulo");
            } else {
                if (numero > 0) {
                    System.out.println("Esse número é positivo");
                } else {
                    System.out.println("Esse número é negativo");
                }
            }
            System.out.println("\nDeseja continuar ?\nS - para Sim \nN - para Não");
            desejaContinuar =ler.next().charAt(0);

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
