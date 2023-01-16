
//Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
import java.util.Scanner;

public class AtividadeTreze {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int numero = 10;

        System.out.println("Me informe um número: ");
        numero = ler.nextInt();

        if (numero > 10) {
            System.out.println("Esse número é maior que 10");
        } else {
            System.out.println("Número menor ou igual a 10");
        }

        ler.close();

    }
}
