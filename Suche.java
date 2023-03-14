

import java.util.Scanner;// Um die Scanner-Klasse zu verwenden, muss diese importiert werden

public class Suche {

    public static void main(String[] args) {

        int zufinden ;
        int[] eins = { 1, 5, 5, 7, 3, 11, 22, 23, 27 };
        int[]zwei = { 33, 5, 3, 5, 9, 7, 11, 23, 23, 3};

        Scanner tastatur = new Scanner(System.in);

        System.out.print("Welche Zahl wollen Sie suchen?: ");
        zufinden = tastatur.nextInt();
        
        if (arraySuche(zufinden, eins)){
            System.out.println("Array 1: Gefunden.");
        }
        else{
            System.out.println("Array 1: Nicht gefunden.");
        }
        if (arraySuche(zufinden, zwei)){
            System.out.println("Array 2: Gefunden.");
        }
        else{
            System.out.println("Array 2: Nicht gefunden.");
        }

        tastatur.close();
    }

    static boolean arraySuche(int zufinden, int[] sucharray){
        for (int i = 0; i < sucharray.length; i++){
            if (sucharray[i] == zufinden) {
                return true;
            }
        }
        return false;
    }
}

