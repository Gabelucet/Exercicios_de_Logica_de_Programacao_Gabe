
//Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados;
import java.util.Scanner;

public class AtividadeSeis {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double variavelTemporaria;

        System.out.println("Me informe um número para a variável A, por favor");
        double A = ler.nextDouble();

        System.out.println("Me informe um número para a variável B, por favor");
        double B = ler.nextDouble();

        variavelTemporaria = A;
        A = B;
        B = variavelTemporaria;

        System.out.println("Os valores foram trocados, me desculpe, a variável A ficou com o valor " + A
                + " a variável B ficou com o valor " + B);

        ler.close();

    }

}