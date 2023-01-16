
//Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9);
import java.util.Scanner;

public class AtividadeDezesseis {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome;
        double notaUm, notaDois, notaTres, media;

        System.out.println("Qual é o seu nome ? ");
        nome = ler.nextLine();
        System.out.println(nome + " me informe a sua 1° nota :");
        notaUm = ler.nextDouble();
        System.out.println("Me informe a sua 2° nota: ");
        notaDois = ler.nextDouble();
        System.out.println("Para finalizar me conte a sua últma nota: ");
        notaTres = ler.nextDouble();

        media = (notaUm + notaDois + notaTres) / 3;

        if (media >= 7) {
            System.out.println("Parabéns você foi aprovado com a nota " + media);
        }
        if (media >= 5.1 && media <= 6.9) {
            System.out.println("Você está de recuperação, pois tirou a nota " + media);
        } else {
            System.out.println("Infelizmente você foi reprovado com a nota de " + media);
        }

        ler.close();
    }

}
