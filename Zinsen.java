import java.util.Scanner;

public class Zinsen {

	public static void main(String[] args) {
        double euro = 0;
        double zinssatz = 0;
        int jahre = 0;
		Scanner tastatur = new Scanner(System.in);
		System.out.print("Einzahlung zu Beginn in €: ");
		euro = tastatur.nextInt();
		System.out.print("Zinssatz in %: ");
		zinssatz = tastatur.nextInt();
        System.out.print("Seit der Einzahlung vergangene Jahre: ");
		jahre = tastatur.nextInt();
        for (int i = 0; i < jahre; i++) {
            euro = euro * (1 + (0.01 * zinssatz));
        }
        System.out.print("Auszahlung: "+euro+"€.");
    }
}
