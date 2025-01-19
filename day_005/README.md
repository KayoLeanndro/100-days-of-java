# Day 5

## Desafio:
Crie uma função em Java para calcular o fatorial de um número.

**Resultado:**

```java

         //Resolução sem overflow
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu numero : ");

        int n = sc.nextInt();
        BigInteger vlTotalFatorial = BigInteger.ONE;

        for(int i = n; i > 0; i--){
            vlTotalFatorial = vlTotalFatorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println("O fatorial de " + n + " é: " + vlTotalFatorial);
```

```java

        //Resolução com overflow 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu numero : ");
        
        int n = scanner.nextInt();
        Integer vlTotalFatorial = 1;

        for(int i = n; i > 0; i--){
           vlTotalFatorial *= i;
        }

        System.out.println(vlTotalFatorial);