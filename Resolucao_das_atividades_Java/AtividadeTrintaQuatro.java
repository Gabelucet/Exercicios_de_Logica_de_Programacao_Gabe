/*Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias:
a. Infantil A = 5 - 7 anos;
b. Infantil B = 8 - 10 anos;
c. Juvenil A = 11- 13 anos;
d. Juvenil B = 14 - 17 anos;
e. Sênior = 18 - 25 anos.
Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado; */

import java.util.Scanner;

public class AtividadeTrintaQuatro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade = 0;

        System.out.print("Qual a sua idade?\nR:");
        idade = ler.nextInt();

        if (idade <= 7) {
            System.out.println("Você está na Liga Infantil B");
        } else {
            if (idade >= 8 && idade <= 10) {
                System.out.println("Você está na Liga Infantil B");
            }
            if (idade >= 11 && idade <= 13) {
                System.out.println("Você está na Liga Juvenil A");
            }
            if (idade >= 14 && idade <= 17) {
                System.out.println("Você está na liga Juvenil B");
            }
            if (idade >= 18 && idade <= 25) {
                System.out.println("Você está na Liga Sênior");
            }
            if (idade > 25) {
                System.out.println("idade fora da faixa etária das Ligas");
            }
        }
        ler.close();
    }
}
