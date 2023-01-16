
//Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário;
import java.util.Scanner;

public class AtividadeOito {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double real, valorCotacao, quantidadeDolar;

        System.out.println("Me informe quantos reais está valendo um dolar, no dia de hoje: ");
        valorCotacao = ler.nextDouble();

        System.out.println("Quantos dolares tem com você ?");
        quantidadeDolar = ler.nextDouble();

        real = (quantidadeDolar * valorCotacao);

        System.out.println("O valor do dolar está R$ " + valorCotacao + " e você tem " + quantidadeDolar
                + " dolares, com a conversão, você tem o total de R$ " + real);

        ler.close();

    }
}
