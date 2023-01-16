
//Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
import java.util.Scanner;

public class AtividadeOnze {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double custoProduto, valorVenda, percentualDeVenda;

        System.out.println("Me informe o preço de custo do produto, por favor :");
        custoProduto = ler.nextDouble();

        System.out.println("Me informe o percentual que será adicionado para venda: ");
        percentualDeVenda = ler.nextDouble();
        // Foi colocado novamente o percentual, para transformar a porcentagem informada
        // em reais.
        percentualDeVenda = (custoProduto * percentualDeVenda) / 100;

        valorVenda = percentualDeVenda + custoProduto;

        System.out.println("O valor de venda do produto é R$ " + valorVenda);

        ler.close();

    }

}
