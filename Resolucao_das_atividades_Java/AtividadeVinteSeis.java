
//Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um número que não esteja neste intervalo, exibir a seguinte mensagem: número inválido;
import java.util.Scanner;

public class AtividadeVinteSeis {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero = 0;

        System.out.println("Me informe um número de 1 a 5");
        numero = ler.nextInt();

        switch (numero) {
            case 1:
                System.out.println("UM");
                break;
            case 2:
                System.out.println("DOIS");
                break;
            case 3:
                System.out.println("TRÊS");
                break;

            case 4:
                System.out.println("QUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;

            default:
                System.out.println("Número invalido");
                break;
        }
        ler.close();

    }
}
