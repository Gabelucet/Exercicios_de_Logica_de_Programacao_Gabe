
//O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos 45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo;
import java.util.Scanner;

public class AtividadeDoze {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double custoFabrica, valorFinal, valorComImpostos;
        double impostos = 45;
        double percentualDoDistribuidor = 28;

        System.out.println("Qual é o valor que a fábrica cobra pelo carro ?");
        custoFabrica = ler.nextDouble();

        valorComImpostos = (custoFabrica * impostos) / 100;
        valorComImpostos = custoFabrica + valorComImpostos;
        valorFinal = (valorComImpostos * percentualDoDistribuidor) / 100;
        valorFinal = valorFinal + valorComImpostos;

        System.out.println("O valor do carro para o cliente final é de R$ " + valorFinal);

        ler.close();

    }
}
