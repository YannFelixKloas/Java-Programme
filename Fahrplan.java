public class Fahrplan {
    public static void main(String[] args) {
        // Weichenstellungen
        int fahrzeit = 0;
        boolean haltInSpandau = false;
        boolean richtungHamburg = false;
        boolean haltInStendal = false;
        char endetIn = 'w'; //h=Hannover, b=Braunschweig, w=Wolfsburg

        fahrzeit = fahrzeit + 8; // Fahrzeit Hbf -> Spandau

        if (haltInSpandau) {
            fahrzeit = fahrzeit + 2; // Halt in Spandau
        }

        if (richtungHamburg) {
            fahrzeit = fahrzeit + 96; //Fahrzeit Spandau -> Hamburg
            System.out.println("Sie erreichen Hamburg nach "+fahrzeit+" Minuten.");
            System.exit(0);
        }
        
        else {
            fahrzeit = fahrzeit + 32; //Fahrzeit Spandau -> Haltepunkt östlich von Stendal
        }

        if (haltInStendal) {
            fahrzeit = fahrzeit + 16;
        }

        else {
            fahrzeit = fahrzeit + 6;
        }

        if (endetIn == 'h') {
            fahrzeit = fahrzeit + 63; //Fahrzeit Haltepunkt westlich von Stendal -> Hannover
            System.out.println("Sie erreichen Hannover nach "+fahrzeit+" Minuten.");
            System.exit(0);
        }

        else if (endetIn == 'b') {
            fahrzeit = fahrzeit + 50; //Fahrzeit Haltepunkt westlich von Stendal -> Braunschweig
            System.out.println("Sie erreichen Braunschweig nach "+fahrzeit+" Minuten.");
            System.exit(0);
        }
        
        else {
            fahrzeit = fahrzeit + 29; //Fahrzeit Haltepunkt westlich von Stendal -> Wolfsburg
            System.out.println("Sie erreichen Wolfsburg nach "+fahrzeit+" Minuten.");
            System.exit(0);
        }
    }
}