import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um numero: ");
            int n = sc.nextInt();

            if(ehPrimo(n)){
                System.out.println("Seu numero é primo");
            }
            else{
                System.out.println("Seu numero não é primo");
            }
    }
    
    public static boolean ehPrimo(int n) {
    	if(n <= 1) {
    		return false;
    	}
        for(int i =  2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
}
