import java.util.Scanner;

public class Zinseszins { 
    public static void main (String[] args) {
        Scanner tastatur = new Scanner(System.in);

        System.out.print("Bitte geben sie die Laufzeit des Vertrags in Jahren an: ");
        int laufzeit = tastatur.nextInt();
        System.out.print("Bitte geben das angelegte Kapital in € an: ");
        double kapital = tastatur.nextDouble();
        System.out.print("Bitte geben den Zinssatz in % an: ");
        double zinssatz = tastatur.nextDouble();

        System.out.println ("Eingezahltes Kapital: " + kapital);
        for (int jahr = 1; jahr <= laufzeit; jahr++){
            kapital = kapital * (1+(0.01*zinssatz));
        }
        System.out.println ("Ausgezahltes Kapital: " + kapital);
        tastatur.close();
    }
}
