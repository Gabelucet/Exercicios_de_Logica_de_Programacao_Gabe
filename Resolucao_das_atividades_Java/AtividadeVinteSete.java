//A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel –14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos clientes;

import java.util.Scanner;

public class AtividadeVinteSete {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double alcool = 0.25d;
        double gasolina = 0.21d;
        double diesel = 0.14d;
        double valorDesconto = 0.0d;
        double valorFinal = 0.0d;
        double valorDoVeiculo = 0.0d;
        char combustivel;
        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {

            System.out.println("\nMe informe o valor do veiculo que está procurando");
            valorDoVeiculo = ler.nextDouble();

            if (valorDoVeiculo == 0) {
                System.out.println("Infelizmente não temos veiculos grátis\nFIM DA CONSULTA");
                break;
            }

            System.out.println(
                    "\nAgora me informe se o veiculo é \nA - PARA ÁLCOOL \nG - PARA      GASOLINA \nD - PARA DIESEL\n");
            combustivel = ler.next().charAt(0);

            if (combustivel == 'A' || combustivel == 'a') {

                valorDesconto = valorDoVeiculo * alcool;
                valorFinal = valorDoVeiculo - valorDesconto;

                System.out.println("\nO valor do desconto do seu veiculo é R$" + valorDesconto);
                System.out.println("\nValor do veiculo com desconto é R$ " + valorFinal + "\n");
            }
            if (combustivel == 'g' || combustivel == 'G') {

                valorDesconto = valorDoVeiculo * gasolina;
                valorFinal = valorDoVeiculo - valorDesconto;

                System.out.println("\nO valor do desconto do seu veiculo é R$" + valorDesconto);
                System.out.println("\nValor do veiculo com desconto é R$ " + valorFinal + "\n");
            }
            if (combustivel == 'D' || combustivel == 'd') {

                valorDesconto = valorDoVeiculo * diesel;
                valorFinal = valorDoVeiculo - valorDesconto;

                System.out.println("\nO valor do desconto do seu veiculo é R$" + valorDesconto);
                System.out.println("\nValor do veiculo com desconto é R$ " + valorFinal + "\n");
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
