import java.util.Scanner;

public class Matrix { 
    public static void main (String[] args) {
        Scanner tastatur = new Scanner(System.in);
        int suche = tastatur.nextInt();

        for (int x = 1; x < 100; x++){
            int einer = x % 10;
            int zehner = x / 10;

            if (x % suche == 0 || einer == suche || zehner == suche || einer + zehner == suche) {
                System.out.print("*\t");
            }
            else {
                System.out.print(x + "\t");
            }
            if (einer == 9){
                System.out.print("\n");
            }
        }
        tastatur.close();
    }
}
