package day_005;

import java.math.BigInteger;
import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {

        // Resolução sem overflow
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu numero : ");

        int n = sc.nextInt();
        BigInteger vlTotalFatorial = BigInteger.ONE;

        for (int i = n; i > 0; i--) {
            vlTotalFatorial = vlTotalFatorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println("O fatorial de " + n + " é: " + vlTotalFatorial);

        // Resolução com overflow
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Digite seu numero : ");

        // int n = scanner.nextInt();
        // Integer vlTotalFatorial = 1;

        // for(int i = n; i > 0; i--){
        // vlTotalFatorial *= i;
        // }

        // System.out.println(vlTotalFatorial);

        sc.close();

    }
}
