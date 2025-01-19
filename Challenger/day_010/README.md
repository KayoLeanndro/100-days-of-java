# Day 10

## Desafio:
Escreva um programa Java que converta uma temperatura de Celsius para Fahrenheit e vice-versa.

**Resultado:**

```java

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