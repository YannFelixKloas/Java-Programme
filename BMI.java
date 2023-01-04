import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		Scanner eingabe = new Scanner(System.in);

		System.out.print ("Bitte geben Sie Ihre Körpergröße in cm an: ");
		double groesse = (eingabe.nextDouble())/100;

		System.out.print ("Bitte geben Sie jetzt Ihr Gewicht in kg an: ");
		int gewicht = eingabe.nextInt();

		System.out.print ("Als letztes geben Sie bitte Ihr Geschlecht an (m/w): ");
		char geschlecht = eingabe.next().charAt(0);
		if (geschlecht != 'm' && geschlecht != 'w') {
			System.out.println("Die Berechnung des BMI funktioniert nur mit binären Geschlechtern.");	
			System.exit(0);
		}

		double bmi = gewicht/(groesse*groesse);
		
		if (geschlecht == 'm') {
			if (bmi < 20){
				System.out.print("Sie haben Untergewicht");
			}
			else if (bmi > 25){
				System.out.print("Sie haben Übergewicht");
			}
			else{
				System.out.print("Sie haben Normalgewicht");
			}
		}
		else if (geschlecht == 'w') {
			if (bmi < 19){
				System.out.print("Sie haben Untergewicht");
			}
			else if (bmi > 24){
				System.out.print("Sie haben Übergewicht");
			}
			else{
				System.out.print("Sie haben Normalgewicht");
			}
		}
		else {
			System.out.println("Fehler! Die vorherige Überprüfung des Geschlechts hat nichnichtt funktioniert.");
			System.exit(0);
		}
		System.out.println(" | BMI: "+bmi);
		eingabe.close();
	}
}