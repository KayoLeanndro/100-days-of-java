import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor em Ceusius: ");
        double valorCelcius = sc.nextDouble();
        System.out.println("Valor em Fahrenheit: " + converteCelciosParaFahrenheit(valorCelcius));

        System.out.println("Digite o valor em Fahrenheit: ");
        double valorFahrenheit = sc.nextDouble();
        System.out.println("Valor em Celcius: " + converteFahrenheitParaCelcius(valorFahrenheit));

        sc.close();
    }

    public static double converteCelciosParaFahrenheit(double valorCelcius) {
        // Para a conversão, pegamos o valor de celcius e multiplicamos por 1.8, e
        // depois adicionamos 32.

        // Formula = (valorCelcius * 1.8) + 32;
        double valorFahrenheit = (valorCelcius * 1.8) + 32;
        return valorFahrenheit;
    }

    public static double converteFahrenheitParaCelcius(double valorFahrenheit) {

        // Formula = (5.0 / 9.0) * (valorFahrenheit - 32);
        double valorCelcius = (5.0 / 9.0) * (valorFahrenheit - 32);
        return valorCelcius;
    }
}