
//Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
import java.util.Scanner;

public class AtividadeQuatro {
        public static void main(String[] args) {
                Scanner ler = new Scanner(System.in);
                // perguntando qual é o nome do funcionario
                System.out.println("Qual o seu nome completo ?");
                String nome = ler.nextLine();
                // qual o salário
                System.out.println(nome + ", me informe seu salário, por favor :");
                double salarioFixo = ler.nextDouble();
                // qual o valor total das vendas
                System.out.println("Me informe qual foi o valor total vendido no mês :");
                double totalDeVendas = ler.nextDouble();
                // Calculo da porcentagem da comissão
                double comissao = (totalDeVendas * 15) / 100;

                double salarioFinal = comissao + salarioFixo;

                System.out.println(
                                nome + ", seu salário do mês é R$ " + salarioFixo + " mais sua comisão que foi de R$ "
                                                + comissao + ", com isso seu salário total é R$ " + salarioFinal);

                ler.close();

        }
}
