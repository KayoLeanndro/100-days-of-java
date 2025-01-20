# Day 14

## Desafio:
Implemente um programa Java que simule uma fila de banco, com operações de entrada e saída de clientes.

**Resultado:**

```java

   public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        
        int c = 0;
        System.out.println("Digite ate 5 entradas (uma por linha):");

        while (c < 5) {
            String input = scanner.nextLine(); 
            if (input != null && !input.isEmpty()) { 
                deque.add(input);
                c++;
            } else {
                System.out.println("Entrada invalida. Tente novamente.");
            }
        }

        System.out.println("Conteudo da fila: " + deque);

        removerDaFila(deque, deque.getFirst());

        System.out.println("Adicione uma nova pessoa na fila.");
        String novaPessoaNaFila = scanner.nextLine();
        adicionarNaFila(deque, novaPessoaNaFila);

        scanner.close();
    }

    public static void removerDaFila(ArrayDeque<String> deque, String conteudo) {
        deque.removeFirst();
        System.out.println(conteudo + " foi saiu da fila :) ");
        System.out.println("Fila atual: " + deque);
    }

    public static void adicionarNaFila(ArrayDeque<String> deque, String conteudo){
        deque.add(conteudo);
        System.out.println(conteudo + "entrou na fila :) ");
        System.out.println("Fila atual: " + deque);
    }