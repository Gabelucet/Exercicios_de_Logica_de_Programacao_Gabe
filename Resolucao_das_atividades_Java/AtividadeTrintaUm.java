//Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se para imprimir o resultado da operação de A por B se C for um símbolo de operador aritmético; caso contrário deve ser impressa uma mensagem de operador não definido. Tratar erro de divisão por zero;

import java.util.Scanner;

public class AtividadeTrintaUm {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double a, b;
        char c = '-';
        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {

            System.out.println(
                    "Olá, você deverá fazer uma conta, para isso irei te perguntar os números e qual conta deseja fazer.");

            System.out.print("Me informe o primeiro número: ");
            a = ler.nextDouble();

            System.out.print("Me informe qual o operador da conta :\n/ - para conta de divisão\n* - para conta de multiplicação\n+ - para conta de adisão\n- para conta de subtração\nSua resposta: ");
            c = ler.next().charAt(0);

            System.out.print("Me informe o segundo número: ");
            b = ler.nextDouble();

            switch (c) {
                case '-':
                    System.out.println("O resultado da operação é : " + (a - b));
                    break;
                case '+':
                    System.out.println("O resultado da operação é : " + (a + b));
                    break;
                case '*':
                    System.out.println("O resultado da operação é : " + (a * b));
                    break;
                case '/':
                    System.out.println("O resultado da operação é : " + (a / b));
                    break;
                default:
                    System.out.println("Operador não definido");
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
                    System.out.println("\nTchau\n");
                    desejaContinuar = 'n';
                    break;
            }
        }

        ler.close();
    }
}
