import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        if (ehPrimo(n)) {
            System.out.println("Seu numero é primo");
        } else {
            System.out.println("Seu numero não é primo");
        }

        sc.close();
    }

    public static boolean ehPrimo(int n) {
        // Verifica se o número é menor ou igual a 1.
        // Números menores ou iguais a 1 (0 e 1) não são primos.
        if (n <= 1) {
            return false;
        }

        // Itera de 2 até a raiz quadrada de 'n'.
        // Não é necessário testar além da raiz quadrada, porque
        // se 'n' tem um divisor maior que sua raiz quadrada,
        // ele terá um divisor correspondente menor que a raiz.
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // Verifica se 'n' é divisível por 'i'.
            // Se for divisível, 'n' não é primo.
            if (n % i == 0) {
                return false;
            }
        }

        // Se nenhum divisor foi encontrado, 'n' é primo.
        return true;
    }

}
