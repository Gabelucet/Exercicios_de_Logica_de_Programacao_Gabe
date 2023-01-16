
// Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou mulher. No final informe total de homens e de mulheres;
import java.util.Scanner;

public class AtividadeDezoito {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int i = 0;
        String nome;
        char sexo;
        int m = 0;
        int f = 0;

        while (i < 56) {
            System.out.println("Qual o seu nome ?");
            nome = ler.next();
            System.out.println(nome + ", qual o seu sexo? M - para masculino e F para feminino");
            sexo = ler.next().charAt(0);
            // Usando o switch case como contador da minha variável
            switch (sexo) {
                case 'M':
                    m++;
                    break;
                case 'm':
                    m++;
                    break;
                case 'F':
                    f++;
                case 'f':
                    f++;
            }
            i++;
        }
        System.out.println("A quantidade de pessoas do sexo masculino é " + m
                + ", a quantidade de pessoas do sexo feminino é " + f);
        ler.close();

    }

}
