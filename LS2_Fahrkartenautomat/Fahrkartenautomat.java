import java.util.Scanner;

class Fahrkartenautomat {
    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);

        //Methoden aufrufen
        begruessung();
        double zuZahlenderBetrag = fahrkartenbestellungErfassen(tastatur);
        double eingezahlterGesamtbetrag = fahrkartenBezahlen(tastatur, zuZahlenderBetrag);
        fahrkartenAusgeben();
        rueckgeldAusgeben(zuZahlenderBetrag, eingezahlterGesamtbetrag);
        verabschiedung();

        tastatur.close();
    }

    static void begruessung() {
        System.out.println("\nHerzlich willkommen!\n");
        return;
    }

    static double fahrkartenbestellungErfassen(Scanner tastatur){
        
        //Definition  der internen Variablen
        int tickettyp;
        int ticketanzahl;
        double ticketpreis;
        double zuZahlenderBetrag = 0;
        boolean auswahlAbgeschlossen = false;

        // Art und Menge der Tickets wählen
        while (!auswahlAbgeschlossen) {
            while (true) {
                System.out.print(
                        "Wählen Sie ihre Wunschfahrkarte für Berlin AB aus:\n1 - Kurzstrecke AB      [2,00 EUR]\n2 - Einzelfahrschein AB [3,00 EUR]\n3 - Tageskarte AB       [8,80 EUR]\n4 - 4-Fahrten-Karte AB  [9,40 EUR]\n");
                tickettyp = tastatur.nextInt();
                if (tickettyp == 1) {
                    ticketpreis = 2.00;
                    break;
                } else if (tickettyp == 2) {
                    ticketpreis = 3.00;
                    break;
                } else if (tickettyp == 3) {
                    ticketpreis = 8.80;
                    break;
                } else if (tickettyp == 4) {
                    ticketpreis = 9.40;
                    break;
                } else {
                    System.out.println("Bitte wählen Sie eines der verfügbaren Tickets aus!");
                    continue;
                }
            }
            while (true) {
                System.out.print("Anzahl der Tickets: ");
                ticketanzahl = tastatur.nextInt();
                if (ticketanzahl >= 1 && ticketanzahl <= 10) {
                    break;
                }
                System.out.println("Fehler! Ihre Eingabe muss zwischen 1 und 10 Tickets liegen.");
            }
            zuZahlenderBetrag = zuZahlenderBetrag + (ticketpreis * ticketanzahl);

            System.out.println("Sind sie fertig? (y/N)");
            char fertig = tastatur.next().charAt(0);
            if (fertig == 'y') {
                auswahlAbgeschlossen = true;
            }
        }
        return zuZahlenderBetrag;
    }

    static double fahrkartenBezahlen(Scanner tastatur, double zuZahlenderBetrag){
        // Geldeinwurf
        double eingezahlterGesamtbetrag = 0.0;
        double €;
        double nochZuZahlen = 0.0;

        while (eingezahlterGesamtbetrag < zuZahlenderBetrag) {
            nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
            System.out.printf("Noch zu zahlen: %.2f Euro\n", nochZuZahlen);
            System.out.print("Eingabe (mind. 5 Cent, höchstens 20 Euro): ");
            € = tastatur.nextDouble();
            if (€ == 0.05 || € == 0.1 || € == 0.2 || € == 0.5 || € == 1.0 || € == 2.0 || € == 5.0 || € == 10.0
                    || € == 20.0) {
                eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + €;
            } else {
                System.out.println("Kein gültiges Zahlungsmittel!");
            }
        }
        return eingezahlterGesamtbetrag;
    }

    static void fahrkartenAusgeben(){
        System.out.println("\nFahrscheine werden ausgegeben");
        for (int i = 0; i < 8; i++) {
            System.out.print("=");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n\n");
    }
        
    static void rueckgeldAusgeben(double zuZahlenderBetrag, double eingezahlterGesamtbetrag) {
        double rueckgabebetrag;
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
        return;
    }

    static void verabschiedung(){
        System.out.println("\nVergessen Sie nicht, die Fahrscheine\n" + "vor Fahrtantritt entwerten zu lassen!\n"
        + "Wir wünschen Ihnen eine gute Fahrt.");
        return;
    }
}