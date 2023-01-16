
/*A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
a. Professor Nível 1 R$12,00 por hora/aula;
b. Professor Nível 2 R$17,00 por hora/aula;
c. Professor Nível 3 R$25,00 por hora/aula. */
import java.util.Scanner;

public class AtividadeTrintaTres {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double horas = 0;
        int nivel;
        double salario;
        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {

            System.out.print("\nMe informe quantas horas você trabalhou esse mês: ");
            horas = ler.nextDouble();

            System.out
                    .print("Me informe qual o seu nível\n1 - Para o nível 1\n2 - Para o nível 2\n3 - Para o nível 3\nSua resposta: ");
            nivel = ler.nextInt();

            switch (nivel) {
                case 1:
                    salario = horas * 12.00;
                    System.out.println("O seu salario é de R$ " + salario);
                    break;
                case 2:
                    salario = horas * 17.00;
                    System.out.println("O seu salario é de R$ " + salario);
                    break;
                case 3:
                    salario = horas * 25.00;
                    System.out.println("O seu salario é de R$ " + salario);
                    break;
                default:
                    System.out.println("Nível invalido");
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
                    System.out.println("\nTchau\n");
                    desejaContinuar = 'N';
                    break;
                case 'n':
                    System.out.println("\nTchau\n");
                    desejaContinuar = 'n';
                    break;
            }
        }
        ler.close();
    }
}
