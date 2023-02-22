import java.util.Scanner;

public class Summe { 
    public static void main (String[] args) {
        Scanner tastatur = new Scanner(System.in);
        System.out.print("Von welcher Zahl wollen Sie die Fakultät berechnen: ");
        int toCalc = tastatur.nextInt();
        System.out.print(toCalc + "!=");
        int sum = 0;
        for (int x = toCalc; x > 0; x--){
            System.out.print(x);
            sum = sum + x;
            if (x != 1){
                System.out.print("+");
            }
        }
        System.out.println("=" + sum);
        tastatur.close();
    }
}
