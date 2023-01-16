
//Faça um algoritmo que receba o número do mês e mostre o mês correspondente. Valide mês inválido;
import java.util.Scanner;

public class AtividadeVinteNove {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char desejaContinuar = 'S';

        int mes;

        while (desejaContinuar == 'S' || desejaContinuar == 's') {

            System.out.println("Me informe o número do mês desejado, de 1 a 12");
            mes = ler.nextInt();

            switch (mes) {
                case 1:
                    System.out.println("Você escolheu o mês de Janeiro");
                    break;
                case 2:
                    System.out.println("Você escolheu o mês de Fevereiro");
                    break;
                case 3:
                    System.out.println("Você escolheu o mês de Março");
                    break;
                case 4:
                    System.out.println("Você escolheu o mês de Abril");
                    break;
                case 5:
                    System.out.println("Você escolheu o mês de Maio");
                    break;
                case 6:
                    System.out.println("Você escolheu o mês de Junho");
                    break;
                case 7:
                    System.out.println("Você escolheu o mês de Julho");
                    break;
                case 8:
                    System.out.println("Você escolheu o mês de Agosto");
                    break;
                case 9:
                    System.out.println("Você escolheu o mês de Setembro");
                    break;
                case 10:
                    System.out.println("Você escolheu o mês de Outubro");
                    break;
                case 11:
                    System.out.println("Você escolheu o mês de Novembro");
                    break;
                case 12:
                    System.out.println("Você escolheu o mês de Dezembro");
                    break;
                default:
                    System.out.println("mês inválido");
                    break;
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
