
//Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 (inclusive);
import java.util.Scanner;

public class AtividadeDezessete {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int i = 0;
        int numero;
        int quantidadeDeRepeticao = 0;

        while (i < 80) {

            System.out.println("Me informe um número: ");
            numero = ler.nextInt();
            i++;

            if (numero >= 10 && numero <= 150) {

                quantidadeDeRepeticao++;
            }
        }

        System.out.println("Foram digitados " + quantidadeDeRepeticao + " números no intervalo entre 10 e 150");
        ler.close();
    }
}
