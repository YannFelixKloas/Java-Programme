import java.util.Scanner;

public class Rechteck {

	public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int umfang = 0;
        int flaeche = 0;
		Scanner tastatur = new Scanner(System.in);
		System.out.print("Kantenlänge a in cm: ");
		a = tastatur.nextInt();
		System.out.print("Kantenlänge b in cm: ");
		b = tastatur.nextInt();
        umfang = 2 * a + 2 * b;
		System.out.println("Umfang in cm: "+umfang);
        flaeche = a * b;
		System.out.println("Fläche in cm^2: "+flaeche);       
    }
}
