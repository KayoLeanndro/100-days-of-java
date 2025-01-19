package day_013;

import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua palavra para verificarmos se é um palindromo ou não");
        String palavra = sc.nextLine();
        System.out.println(palavraEPalindromo(palavra));

        sc.close();
    }

    public static String palavraEPalindromo(String palavra) {
        // Logica utilizada:

        // Primeiramente pegamos a palavra, invertemos ela e atribuimos a palavra
        // invertida
        // a variavel resultado, depois disso verificamos se a palavra resultado é igual
        // a
        // palavra que foi passada como parametro.

        String resultado = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            resultado += palavra.charAt(i);
        }
        if (resultado.equals(palavra)) {
            return "Palindromo";
        }
        return "Nao Palindromo";

    }
}
