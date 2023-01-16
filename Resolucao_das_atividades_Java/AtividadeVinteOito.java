
/*Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo com os seguintes critérios:
a. 50% para aqueles que ganham menos do que três salários mínimos;
b. 20% para aqueles que ganham entre três até dez salários mínimos;
c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
d. 10% para os demais funcionários.
Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa vai aumentar sua folha de pagamento; */

import java.util.Scanner;

public class AtividadeVinteOito {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double tresSalarios = 0.5;
        double dezSalarios = 0.20d;
        double vinteSalarios = 0.15d;
        double demaisSalarios = 0.10d;
        double valorDeAumento = 0.0d;
        String nomeDoFuncionario;
        double salarioFuncionario = 0;
        double salarioMinimo;
        double novoSalario = 0;
        double folhaDePagamento = 0;

        for (int i = 0; i < 584; i++) {
            System.out.print("\nMe informe seu nome : ");
            nomeDoFuncionario = ler.next();
            System.out.print(nomeDoFuncionario + ", me informe o seu salário: ");
            salarioFuncionario = ler.nextDouble();
            System.out.print("Me fale o valor do salário Minímo: ");
            salarioMinimo = ler.nextDouble();

            if (salarioFuncionario <= (salarioMinimo * 3)) {
                valorDeAumento = salarioFuncionario * tresSalarios;
                novoSalario = salarioFuncionario + valorDeAumento;

                System.out.println("O seu novo salario é " + novoSalario);
            } else {
                if (salarioFuncionario >= (salarioMinimo * 3) && salarioFuncionario <= (salarioMinimo * 10)) {
                    valorDeAumento = salarioFuncionario * dezSalarios;
                    novoSalario = salarioFuncionario + valorDeAumento;

                    System.out.println("O seu novo salario é " + novoSalario);
                }
                if (salarioFuncionario >= (salarioMinimo * 10) && salarioFuncionario <= (salarioMinimo * 20)) {
                    valorDeAumento = salarioFuncionario * vinteSalarios;
                    novoSalario = salarioFuncionario + valorDeAumento;

                    System.out.println("O seu novo salario é " + novoSalario);
                }
                if (salarioFuncionario > (salarioMinimo * 20)) {
                    valorDeAumento = salarioFuncionario * demaisSalarios;
                    novoSalario = salarioFuncionario + valorDeAumento;

                    System.out.println("O seu novo salario é " + novoSalario);
                }

            }
            folhaDePagamento = folhaDePagamento + valorDeAumento;
        }
        System.out.println("\nO aumento na folha de pagamento é de R$ " + folhaDePagamento);
        ler.close();
    }

}