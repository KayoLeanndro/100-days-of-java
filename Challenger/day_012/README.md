# Day 12

## Desafio:
Implemente um programa Java que calcule a média de uma lista de números.

**Resultado:**

```java

public static double mediaArray(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double media = (double) sum / array.length;
        return media;
    }