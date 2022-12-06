import java.util.Scanner;

public class Spielbank {

	public static void main(String[] args) {
        int fuenfer = 0;
        int zehner = 0;
        int zwanziger = 0;
        int fuenfziger = 0;
        int hunderter = 0;
        int euro = 0;
		Scanner tastatur = new Scanner(System.in);
		System.out.print("5€-Chips: ");
		fuenfer = tastatur.nextInt();
		System.out.print("10€-Chips: ");
		zehner = tastatur.nextInt();
        System.out.print("20€-Chips: ");
		zwanziger = tastatur.nextInt();
        System.out.print("50€-Chips: ");
		fuenfziger = tastatur.nextInt();
        System.out.print("100€-Chips: ");
		hunderter = tastatur.nextInt();
        euro = fuenfer * 5 + zehner * 10 + zwanziger * 20 + fuenfziger * 50 + hunderter * 100;
        System.out.println("\nSie erhalten "+euro+"€.\n");
		tastatur.close();
	}
}
