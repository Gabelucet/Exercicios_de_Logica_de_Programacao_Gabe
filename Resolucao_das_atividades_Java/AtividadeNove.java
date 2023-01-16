//Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um mês.Considere fixo o juro da poupança em 0,07% a.m;

import java.util.Scanner;

public class AtividadeNove {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double deposito;

        System.out.println("Qual foi o valor deposito ?");
        deposito = ler.nextDouble();

        double juros = (deposito * 0.07) / 100;
        double valorTotal = juros + deposito;

        System.out.println("O valor de juros que recebera esse mês é de R$ " + juros
                + "  Com isso o valor total da sua conta é de  R$ " + valorTotal);

        ler.close();

    }
}
