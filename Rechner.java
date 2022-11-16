import java.util.Scanner;

public class Rechner {

	public static void main(String[] args) {
		int zahl1 = 0;
		int zahl2 = 0;
		int summe = 0;
		int differenz = 0;
		int produkt = 0;
		int quotient = 0;
		int modulo = 0;
		Scanner tastatur = new Scanner(System.in);
		System.out.print("Bitte geben Sie eine ganze Zahl ein: ");
		zahl1 = tastatur.nextInt();
		System.out.print("Bitte geben Sie eine zweite ganze Zahl ein: ");
		zahl2 = tastatur.nextInt();
		summe = zahl1 + zahl2;
		System.out.println("\nSumme: " + summe);
		differenz = zahl1 - zahl2;
		System.out.println("Differenz: "+ differenz);
		produkt = zahl1 * zahl2;
		System.out.println("Produkt: "+ produkt);
		quotient = zahl1 / zahl2;
		System.out.println("Quotient: "+quotient);
		modulo = zahl1 % zahl2;
		System.out.println("Rest: "+modulo);
		tastatur.close();
	}
}
