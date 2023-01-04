import java.util.Scanner;

public class Rabattsystem {

    public static void main (String []args){

        System.out.print("Eingabe: ");
        Scanner eingabe = new Scanner(System.in);
        double bestellwert = eingabe.nextDouble();
        double rabatt = 0.0;

        if (bestellwert > 0.0 && bestellwert < 100.0){
            rabatt = 0.1;
        }
        if (bestellwert <= 100.0 && bestellwert < 500.0){
            rabatt = 0.15;
        }
        else {
            rabatt = 0.2;
        }

        bestellwert = bestellwert * (1.0-rabatt);
        System.out.println("Ausgabe: " + bestellwert);
		eingabe.close();
    }
}