
//A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. Informar total de carros com ano até 2000 e total geral;
import java.util.Scanner;

public class AtividadeDezenove {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        char continuarConsulta = 's';
        int anoDoCarro;
        double desconto;
        double valorDoCarro;
        double valorDoDesconto;
        int carroVelho = 0;
        int carroNovo = 0;

        System.out.println("Seja bem vindo a concessionária de veículos CARANGO VELHO");

        while (continuarConsulta == 'S' || continuarConsulta == 's') {

            System.out.println("Qual o valor do carro? ");
            valorDoCarro = ler.nextDouble();
            System.out.println("Qual ano do carro que você deseja saber o valor ?");
            anoDoCarro = ler.nextInt();

            if (anoDoCarro <= 2000) {
                desconto = 0.12;
                carroVelho++;

            } else {
                desconto = 0.07;
                carroNovo++;
            }

            valorDoDesconto = valorDoCarro * desconto;
            valorDoCarro = valorDoCarro - valorDoDesconto;

            System.out.println("O valor do desconto do carro é de R$" + valorDoDesconto
                    + ", com o desconto o valor do carro fica R$" + valorDoCarro);

            System.out.println("Você deseja pesquisar um novo carro ?");
            continuarConsulta = ler.next().charAt(0);

            switch (continuarConsulta) {
                case 'S':
                    continuarConsulta = 'S';
                    break;
                case 's':
                    continuarConsulta = 's';
                    break;
                case 'N':
                    continuarConsulta = 'N';
                    System.out.println("Muito obrigado pela preferência");
                    break;
                case 'n':
                    continuarConsulta = 'n';
                    System.out.println("Muito obrigado pela preferência");
                    break;
                default:
                    break;
            }
        }
        System.out.println("Foram consultados " + carroVelho + " carros do ano abaixo de 2000, e " + carroNovo
                + " do ano acima de 2000");
        ler.close();
    }
}
