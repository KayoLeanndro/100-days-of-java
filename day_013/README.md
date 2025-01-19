# Day 13

## Desafio:
Escreva um programa Java que verifique se uma string é um palíndromo.

**Resultado:**

```java

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