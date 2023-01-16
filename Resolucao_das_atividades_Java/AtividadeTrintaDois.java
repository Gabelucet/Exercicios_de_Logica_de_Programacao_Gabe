/*Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo. Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno. Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos outros dois lados.
a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
c. Triângulo equilátero é também isóscele;
d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes; */

import java.util.Scanner;

public class AtividadeTrintaDois {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double ladoUm, ladoDois, ladotres;
        char pergunta = 's';

        System.out.print("Me informe o primeiro valor: ");
        ladoUm = ler.nextDouble();
        System.out.print("Me informe o segundo valor: ");
        ladoDois = ler.nextDouble();
        System.out.print("Me informe o terceiro valor: ");
        ladotres = ler.nextDouble();

        System.out.print("Os valores informados são as medidas dos lados de um triângulo ?\nSua resposta: ");
        pergunta = ler.next().charAt(0);

        if (pergunta == 's' || pergunta == 'S') {
            if (ladoUm == ladoDois && ladoUm == ladotres && ladoDois == ladotres) {
                System.out.println("\nPelos valores informados esse triângulo, é um  Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;");
            }else{
                if (ladoDois == ladotres || ladoDois == ladoUm || ladotres == ladoUm) {
                    System.out.println("Pelos valores informados, esse é um Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.\nLembrando que um Triângulo equilátero é também isóscele;");
                }
                if (ladoUm != ladoDois && ladoUm != ladotres && ladotres != ladoDois) {
                    System.out.println("Pelos valores informados esse é um Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;");
                }
            }
        } else {
            System.out.println("É UMA PENA QUE NÃO É UM TRIANGULO, TCHAUZINHO");
        }
        ler.close();
    }
}
