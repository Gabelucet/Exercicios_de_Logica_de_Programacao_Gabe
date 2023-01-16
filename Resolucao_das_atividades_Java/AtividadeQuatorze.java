
//Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
import java.util.Scanner;

public class AtividadeQuatorze {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numeroUm, numeroDois;

        System.out.println("Me informe o 1° número aleatório");
        numeroUm = ler.nextInt();

        System.out.println("Me informe o 2° número aleatório");
        numeroDois = ler.nextInt();

        if (numeroUm > numeroDois) {
            System.out.println("O 1° número é maior que o 2° número informado");
        } else {
            System.out.println("O 2° número é maior que o 1° número informado");
        }

        ler.close();
    }
}
