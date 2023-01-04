import java.util.Scanner;

public class Rom {
	public static void main(String[] args) {
		int ergebnis = 0;
		Scanner tastatur = new Scanner(System.in);

		System.out.print("Bitte geben Sie eine römische Zahl ein (1-3999): ");

        String zahl = tastatur.next();
		for (byte pos = 0; pos < zahl.length(); pos++) {
            char stelle = zahl.charAt(pos);
            switch (stelle) {
                case 'M':
                    ergebnis = ergebnis+1000;
                    break;
                case 'D':
                    ergebnis = ergebnis+500;
                    break;
                case 'C':
                    if (pos == zahl.length()-1){
                        ergebnis = ergebnis+100;
                        break;
                    }
                    if (zahl.charAt(pos+1)=='D' || zahl.charAt(pos+1)=='M'){
                        ergebnis = ergebnis-100;
                    }
                    else {
                        ergebnis = ergebnis+100;
                    }
                    break;
                case 'L':
                    ergebnis = ergebnis+50;
                    break;
                case 'X':
                    if (pos == zahl.length()-1){
                        ergebnis = ergebnis+10;
                        break;
                    }
                    if (zahl.charAt(pos+1)=='L' || zahl.charAt(pos+1)=='C'){
                        ergebnis = ergebnis-10;
                    }
                    else {
                        ergebnis = ergebnis+10;
                    }
                    break;
                case 'V':
                    ergebnis = ergebnis+5;
                    break;
                case 'I':
                    if (pos == zahl.length()-1){
                        ergebnis = ergebnis+1;
                        break;
                    }
                    if (zahl.charAt(pos+1)=='V' || zahl.charAt(pos+1)=='X'){
                        ergebnis = ergebnis-1;
                    }
                    else {
                        ergebnis = ergebnis+1;
                    }
                    break;
               default:
                    System.out.println("Fehlerhafte Eingabe.");
                    System.exit(0);
            }
        }
        System.out.println("Ergebnis: "+ergebnis);
		tastatur.close();
	}
}