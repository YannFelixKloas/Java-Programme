import java.util.Scanner;

class Fahrkartenautomat {
    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);

        double ticketpreis;
        int ticketanzahl;
        double zuZahlenderBetrag;
        double eingezahlterGesamtbetrag;
        double €;
        double rueckgabebetrag;
        double nochZuZahlen;

        // Geldbetrag eingeben
        System.out.print("Ticketpreis (Euro): ");
        ticketpreis = tastatur.nextDouble();
        if (ticketpreis < 0) {
            System.out.println ("Fehler! Ihre Eingabe darf nicht negativ sein. Es wird ein Standardpreis von 1€ angenommen.");
            ticketpreis = 1.0;
        }
        System.out.print("Anzahl der Tickets: ");
        ticketanzahl = tastatur.nextInt();
        if (ticketanzahl < 1 || ticketanzahl > 10) {
            System.out.println ("Fehler! Ihre Eingabe muss zwischen 1 und 10 Tickets liegen. Es wird ein Standardmenge von einem Ticket angenommen.");
        }
        zuZahlenderBetrag = ticketpreis * ticketanzahl;
        

        // Geldeinwurf
        eingezahlterGesamtbetrag = 0.0;
        nochZuZahlen = 0.0;
        while (eingezahlterGesamtbetrag < zuZahlenderBetrag) {
            nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
            System.out.printf("Noch zu zahlen: %.2f Euro\n", nochZuZahlen);
            System.out.print("Eingabe (mind. 5 Cent, höchstens 20 Euro): ");
            € = tastatur.nextDouble();
            if (€ == 0.05 || € == 0.1 || € == 0.2 || € == 0.5 || € == 1.0 || € == 2.0 || € == 5.0 || € == 10.0 || € == 20.0) {
                eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + €;
            }
            else {
                System.out.println("Kein gültiges Zahlungsmittel!");
            }
        }

        // Fahrscheinausgabe
        System.out.println("\nFahrscheine werden ausgegeben");
        for (int i = 0; i < 8; i++) {
            System.out.print("=");
            try {
                Thread.sleep(200);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n\n");

        // Rückgeldberechnung und -ausgabe
        rueckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
        if (rueckgabebetrag > 0.0) {
            System.out.println("Der Rückgabebetrag in Höhe von " + rueckgabebetrag + " Euro");
            System.out.println("wird in folgenden Münzen ausgezahlt:");

            while (rueckgabebetrag >= 1.999) { // 2-Euro-Münzen
                System.out.println("2 Euro");
                rueckgabebetrag = rueckgabebetrag - 2.0;
            }
            while (rueckgabebetrag >= 0.999) { // 1-Euro-Münzen
                System.out.println("1 Euro");
                rueckgabebetrag = rueckgabebetrag - 1.0;
            }
            while (rueckgabebetrag >= 0.499) { // 50-Cent-Münzen
                System.out.println("50 Cent");
                rueckgabebetrag = rueckgabebetrag - 0.5;
            }
            while (rueckgabebetrag >= 0.199) { // 20-Cent-Münzen
                System.out.println("20 Cent");
                rueckgabebetrag = rueckgabebetrag - 0.2;
            }
            while (rueckgabebetrag >= 0.099) { // 10-Cent-Münzen
                System.out.println("10 Cent");
                rueckgabebetrag = rueckgabebetrag - 0.1;
            }
            while (rueckgabebetrag >= 0.0499) { // 5-Cent-Münzen
                System.out.println("5 Cent");
                rueckgabebetrag = rueckgabebetrag - 0.05;
            }
        }

        System.out.println("\nVergessen Sie nicht, die Fahrscheine\n" + "vor Fahrtantritt entwerten zu lassen!\n"
                + "Wir wünschen Ihnen eine gute Fahrt.");

        tastatur.close();
    }
}