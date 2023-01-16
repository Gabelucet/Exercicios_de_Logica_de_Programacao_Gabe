//A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco)prestações sem juros. Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações;

import java.util.Scanner;

public class AtividadeDez {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double valorCompra;
        System.out.println("Qual foi o valor total da sua compra ?");
        valorCompra = ler.nextDouble();

        double valorDasPrestacoes = valorCompra / 5;

        System.out.println("O valor das prestações ficaram no valor de R$ " + valorDasPrestacoes);

        ler.close();

    }
}
