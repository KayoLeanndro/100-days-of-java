# Day 7

## Desafio:
Escreva um programa Java que inverta uma string.

**Resultado:**

```java

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        
        //String cortada
        String[] stringSlitep = string.split("");
        //Variavel de string que vai ser invertida  
        String[] inversedString = new String[stringSlitep.length];
        //Percorrer o tamanho total do ArrayString 
        for(int i = 0; i < stringSlitep.length; i++){
            for(int y = stringSlitep.length - 1; y >= 0; y--){ 
                inversedString[i] = stringSlitep[y];
                i++;
            }
        }

        for(int i = 0; i < stringSlitep.length; i++ ){
            System.out.print(inversedString[i]);
        }

    }