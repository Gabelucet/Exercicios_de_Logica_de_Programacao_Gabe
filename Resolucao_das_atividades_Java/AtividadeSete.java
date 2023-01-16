
//Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;
import java.util.Scanner;

public class AtividadeSete {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double grausCelsius;

        System.out.println("Me informe qual é a temperatura em graus Celsius: ");
        grausCelsius = ler.nextDouble();

        double Fahrenheit = (9 * grausCelsius + 160) / 5;

        System.out.println("Fazendo a conversão, a temperatura em graus Fahrennheit fica " + Fahrenheit + "F");

        ler.close();
    }
}
