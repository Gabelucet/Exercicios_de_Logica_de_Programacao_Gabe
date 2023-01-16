//2. Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos dois números lidos;

public class AtividadeDois {

        public static void main(String[] args) {
                // números que serão feitos calculos
                int numberOne = 19;
                int numberTwo = 19;

                // Operações
                int soma = numberOne + numberTwo;
                int subtracao = numberOne - numberTwo;
                int multiplicacao = numberOne * numberTwo;
                float divisao = numberOne / numberTwo;
                // resultados
                System.out.println("O resultado da operação de soma é " + soma);
                System.out.println("O resultado da operação de subtração é " + subtracao);
                System.out.println("O resultado da operação de multiplicação é " + multiplicacao);
                System.out.println("O resultado da operação da divisão é " + divisao);
        }
}