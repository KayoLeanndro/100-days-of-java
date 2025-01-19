package day_008;

public class Day8 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double resultadoSoma = calculadora.soma(10, 3);
        System.out.println("A soma é: " + resultadoSoma);

        double resultadoSubtracao = calculadora.subtracao(10, 3);
        System.out.println("A subtração é: " + resultadoSubtracao);

        double resultadoMultiplicacao = calculadora.multiplicacao(10, 3);
        System.out.println("A multiplicação é: " + resultadoMultiplicacao);

        try {
            double resultadoDivisao = calculadora.divisao(10, 3);
            System.out.println("A divisão é: " + resultadoDivisao);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            double resultadoDivisaoPorZero = calculadora.divisao(10, 2);
            System.out.println("A divisão por zero é: " + resultadoDivisaoPorZero);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

class Calculadora {

    public double soma(double n1, double n2) {
        return n1 + n2;
    }

    public double subtracao(double n1, double n2) {
        return n1 - n2;
    }

    public double multiplicacao(double n1, double n2) {
        return n1 * n2;
    }

    public double divisao(double n1, double n2) {
        if (n2 == 0) {
            throw new ArithmeticException("Não é possível divisão por zero.");
        }
        return n1 / n2;
    }
}
