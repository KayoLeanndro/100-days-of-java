import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        
        String[] stringSlitep = string.split(string);
        for(int i = 0; i < stringSlitep.length; i++){
            System.out.println("dsd" + i);
        }
    }
}