

import java.util.Scanner;// Um die Scanner-Klasse zu verwenden, muss diese importiert werden

public class Schaltjahr {

    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in); // Erzeugen eines Objekts der Klasse Scanner
        String janein = "";

        System.out.print("Bitte geben Sie eine Jahreszahl ein (nach Christus): ");
        int jahr = tastatur.nextInt();
        if (jahr % 4 == 0){
            if (jahr % 100 == 0 && jahr >= 1582) {
                if (jahr % 400 != 0) {
                    janein = "nicht ";
                }
            }
            else {
                janein = "";
            }
        }
        else {
            janein = "nicht ";
        }
        System.out.printf ("Es handelt sich %sum ein Schaltjahr.\n", janein);
        tastatur.close();
    }
}

