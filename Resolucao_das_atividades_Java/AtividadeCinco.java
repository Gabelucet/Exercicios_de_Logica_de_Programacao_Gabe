//Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. No final informar o nome do aluno e a sua média (aritmética);

import java.util.Scanner;

public class AtividadeCinco {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o seu nome ?");
        String nomeCompleto = ler.nextLine();

        System.out.println(nomeCompleto + " me informe a nota da sua primeira prova: ");
        double notaUm = ler.nextDouble();

        System.out.println("Agora me informe a nota da sua segunda prova: ");
        double notaDois = ler.nextDouble();

        System.out.println("Para terminar me informe a nota da sua última prova do semestre");
        double notaTres = ler.nextDouble();

        double mediaFinal = (notaUm + notaDois + notaTres) / 3;

        System.out.println(nomeCompleto + "a sua média final do semestre foi " + mediaFinal);

        ler.close();
    }

}
