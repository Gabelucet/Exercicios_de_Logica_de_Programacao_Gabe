//Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor de venda de cada produto, a média de preço de custo e do preço de venda;
import java.util.Scanner;

public class AtividadeVinteDois {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int repeticao = 0;
        double custo, precoVenda, precoLucro;
        double mediaVenda = 0.0d;
        double mediaCusto = 0.0d;

        while (repeticao < 40) {
            // pedindo os preços dos produtos;
            System.out.println("\nQual o preço de custo do produto ?");
            custo = ler.nextDouble();
            System.out.println("Qual o preço de venda do produto ?");
            precoVenda = ler.nextDouble();
            // variável para calcular se está tento lucro ou prejuízo;
            precoLucro = precoVenda - custo;
            // para guardar os valores dos produtos, para depois conseguir calcular a média;
            mediaVenda = mediaVenda + precoVenda;
            mediaCusto = mediaCusto + custo;

            // condicional para saber se está tendo lucro ou prejuízo
            if (custo < precoVenda) {
                System.out.println("Tivemos um lucro de R$ " + precoLucro);
                System.out.println("O produto está tendo o custo de R$" + custo + ", e sendo vendido pelo preço de R$ "
                        + precoVenda);
            }
            if (custo > precoVenda) {
                System.out.println("Tivemos o prejuízo de R$ " + precoLucro);
                System.out.println("O produto está tendo o custo de R$" + custo + ", e sendo vendido pelo preço de R$ "
                        + precoVenda);
            }
            if (custo == precoVenda) {
                System.out.println("Não tivemos nem lucro e nem prejuizo");
                System.out.println("O produto está tendo o custo de R$" + custo + ", e sendo vendido pelo preço de R$ "
                        + precoVenda);
            }
            repeticao++;
        }
        System.out.println("\nO preço médio de custo é R$ " + (mediaCusto / repeticao));
        System.out.println("\nO preço médio de venda é R$ " + (mediaVenda / repeticao));

        ler.close();
    }
}