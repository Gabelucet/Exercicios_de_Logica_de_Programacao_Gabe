
//Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
import java.util.Scanner;

public class AtividadeQuinze {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numeroAleatorio;

        System.out.println("Me informe um número aleatório, por favor: ");
        numeroAleatorio = ler.nextInt();

        if (numeroAleatorio >= 100 && numeroAleatorio <= 200) {
            System.out.println("O número está no intervalo entre 100 e 200");
        } else {
            System.out.println("O número não está no intervalo entre 100 e 200");
        }
        ler.close();
    }

}
