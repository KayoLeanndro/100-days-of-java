# Day 9

## Desafio:
Implemente um programa Java que ordene um array de números.

**Resultado:**

```java

 // Bubble sort como ordenador
    public static int[] arraySort(int[] array) {

        // Laço externo: percorre cada elemento do array
        for (int i = 0; i < array.length; i++) {

            // Laço interno: compara o elemento atual (i) com os elementos seguintes (j)
            for (int j = i + 1; j < array.length; j++) {

                // Se o elemento na posição i for maior que o na posição j, troca-os
                if (array[i] > array[j]) {
                    int aux = array[i]; // Variável auxiliar para armazenar o valor temporariamente
                    array[i] = array[j]; // Atribui o valor de j para i
                    array[j] = aux; // Atribui o valor armazenado de i para j
                }

            }
        }

        return array;
    }
```
```java
    public static void main(String[] args) {

        int[] array = new int[10];

        // Preenchendo o array com números aleatórios entre 0 e 9
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * array.length); // Gera números aleatórios
        }

        arraySort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }