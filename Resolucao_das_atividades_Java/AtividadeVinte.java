
//Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e “menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;
import java.util.Scanner;

public class AtividadeVinte {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int repeticao = 0;
        int idade = 0;
        String nome;

        while (repeticao < 75) {

            System.out.println("Qual o seu nome ?");
            nome = ler.next();
            System.out.println("Olá " + nome + ", me informe a sua idade: ");
            idade = ler.nextInt();

            if (idade < 18) {
                System.out.println(nome + " ,você é menor de idade");
            } else {
                System.out.println(nome + " ,você é maior de idade");
            }
            repeticao++;
        }

        ler.close();

    }
}
