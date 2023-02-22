import java.util.Scanner;

public class Treppe { 
    public static void main (String[] args) {
        
        Scanner tastatur = new Scanner(System.in);
        System.out.print("Stufenbreite: ");
        int stufenbreite = tastatur.nextInt();
        System.out.print("Höhe: ");
        int hoehe = tastatur.nextInt();
        
        for (int spalte = 1; spalte <= hoehe; spalte++){
            int empty = hoehe-spalte;
            for (int i = 1; i <= empty; i++){
                for (int x = 1; x <= stufenbreite; x++) {
                    System.out.print(" ");
                }
            }
            for (int j = empty + 1; j <= hoehe; j++){
                for (int y = 1; y <= stufenbreite; y++) {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
        tastatur.close();
    }
}
