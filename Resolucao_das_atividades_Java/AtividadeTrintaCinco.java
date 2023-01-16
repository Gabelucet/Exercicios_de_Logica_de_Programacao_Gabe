/*Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de luz segue a tabela abaixo:
Tipo de Cliente Valor do KW/h
a. (Residência) 0,60;
b. (Comércio) 0,48;
c. (Indústria) 1,29.*/

import java.util.Scanner;

public class AtividadeTrintaCinco {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int tipoDeCliente;
        double kwConsumidos = 0.0d;
        double residencia = 0.60d;
        double comercio = 0.48d;
        double industria = 1.29d;
        double valorDaconta;

        System.out.print("Para saber sobre seu consumo de energia, escolha em qual perfil você se encaixa\n1 - Para Residência\n2 - Para Comércio\n3 - Para Indústria\nSua Resposta: ");
        tipoDeCliente = ler.nextInt();

        System.out.print("Você consumiu quantos KW/M ?\nSua Resposta: ");
        kwConsumidos = ler.nextDouble();

        switch (tipoDeCliente) {
            case 1:
                valorDaconta = kwConsumidos * residencia;
                System.out.println("O valor da sua conta é R$ " + valorDaconta);
                break;
            case 2:
                valorDaconta = kwConsumidos * comercio;
                System.out.println("O valor da sua conta é R$ " + valorDaconta);
                break;
            case 3:
                valorDaconta = kwConsumidos * industria;
                System.out.println("O valor da sua conta é R$ " + valorDaconta);
                break;
            default:
                System.out.println("Número escolhido é invalido");
                break;
        }

        ler.close();
    }

}
