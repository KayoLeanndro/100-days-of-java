# Day 4

## Desafio:
 Escreva um programa Java que verifique se um número é par ou ímpar e imprima o resultado.

**Resultado:**

```java

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("Par");
        }
        else{
            System.out.println("Impar");
        }

    }