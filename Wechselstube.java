import java.util.Scanner;

public class Wechselstube {

	public static void main(String[] args) {
		int euro = 0;
		int cent = 0;
        int zweieuros = 0;
        int fuenfzigcents = 0;
        int zwanzigcents = 0;
        int zehncents = 0;
        int fuenfcents = 0;
        int zweicents = 0;
		Scanner tastatur = new Scanner(System.in);
		System.out.print("Wie viel Euro möchten Sie einzahlen?: ");
		euro = tastatur.nextInt();
		System.out.print("Wie viel Cent möchten Sie einzahlen?: ");
		cent = tastatur.nextInt();
        System.out.println("\nSie erhalten den Betrag von "+euro+","+cent+"€ als:");
        zweieuros = euro / 2;
        System.out.println(zweieuros + " 2-Euro-Münzen,");
        euro = euro % 2;
        System.out.println(euro + " 1-Euro-Münzen,");
        fuenfzigcents = cent / 50;
        cent = cent %  50;
        System.out.println(fuenfzigcents + " 50-Cent-Münzen,");
        zwanzigcents = cent / 20;
        cent = cent %  20;
        System.out.println(zwanzigcents + " 20-Cent-Münzen,");
        zehncents = cent / 10;
        cent = cent %  10;
        System.out.println(zehncents + " 10-Cent-Münzen,");
        fuenfcents = cent / 5;
        cent = cent %  5;
        System.out.println(fuenfcents + " 5-Cent-Münzen,");
        zweicents = cent / 2;
        System.out.println(zweicents + " 2-Cent-Münzen,");
        cent = cent %  2;
        System.out.println(cent + " 1-Cent-Münzen.");
		tastatur.close();
	}
}
