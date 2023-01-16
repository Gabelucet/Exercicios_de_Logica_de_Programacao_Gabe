//Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta ou não para cumprir o serviço militar obrigatório. Informe os totais;

import java.util.Scanner;

public class AtividadeVinteUm {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String nome;
        char sexo;
        char saude;
        int idade;
        int repeticao = 0;
        int pessoasAtendidas = 0;
        int apto = 0;

        while (repeticao < 10) {
            System.out.println("Qual o seu nome ?");
            nome = ler.next();
            System.out.println(nome + ", qual o seu sexo ? Sendo F para Feminino e M para Masculino");
            sexo = ler.next().charAt(0);
            System.out.println("Qual a sua idade");
            idade = ler.nextInt();
            System.out.println(nome + ", qual o estado da saúde ? Sendo B - Bom / R - regular / D - Debilitada");
            saude = ler.next().charAt(0);

            if (idade < 18) {
                System.out.println(
                        "Você está elimando, pois tem a idade de " + idade + ", sendo considerado menor de idade");
            }
            if (sexo == 'F' || sexo == 'f') {
                System.out.println(
                        "Infelizmente você não poderá servir, pois o serviço militar obrigatorio se aplica apenas as pessoas do sexo Masculino, para adentra as F.A. procure por um dos processos seletivos que estão abertos.");
            } else {
                if (saude == 'B' || saude == 'b') {
                    System.out.println(nome + ", parabéns, você foi selecionado(a) para servir as forças armadas");
                    apto++;

                } else {
                    System.out.println(
                            "Infelizmente, você não poderá servir, procure a junta militar mais próxima da sua cidade");

                }
            }
            pessoasAtendidas++;
            repeticao++;
        }
        System.out.println("O total de pessoas atendidas foram de " + pessoasAtendidas);
        System.out.println("O total de pessoas aptas a servirem foram de " + apto);
        ler.close();

    }
}
