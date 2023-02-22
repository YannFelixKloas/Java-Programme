import java.util.Scanner;

public class Urlaub { 
    public static void main (String[] args) {

        Scanner tastatur = new Scanner(System.in);
        
        System.out.print("Bitte geben Sie ihr Reisebugdet in € an: ");
        double geldbeutel = tastatur.nextDouble();
        double eiserneReserve = geldbeutel * 0.1;
        boolean nachHause = false;

        while(!nachHause){
            System.out.println("In welches Land reisen Sie (USA, Japan, England, Schweiz, Dänemark): ");
            String land = tastatur.next().toLowerCase();
            System.out.println("Wie viel Geld wollen Sie wechseln: ");
            double wechseln = tastatur.nextDouble();
            switch(land){
                case "usa":
                    double $ = toDollar(wechseln);
                    System.out.printf("Sie erhalten %.2f$.", $);
                    break;
                case "japan":
                    double ¥ = toYen(wechseln);
                    System.out.printf("Sie erhalten %.0f¥.", ¥);
                    break;
                case "england":
                    double £ = toPfund(wechseln);
                    System.out.printf("Sie erhalten %.2f£.", £);
                    break;
                case "schweiz":
                    double CHF = toFranken(wechseln);
                    System.out.printf("Sie erhalten %.2f CHF.", CHF);
                    break;
                case "dänemark":
                    double Kr = toKrone(wechseln);
                    System.out.printf("Sie erhalten  %.2f Kr.", Kr);
                    break;
                default:
                    System.out.println("Für dieses Land steht leider kein Wechsel-Service zur Verfügung.");
                    wechseln = 0.0;
                    break;

            }
            geldbeutel = geldbeutel - wechseln;
            System.out.println("Übriges Reisebugdet: " + geldbeutel +"€.");
            if (geldbeutel < eiserneReserve){
                System.out.print("Es sind nur noch 10% ihres Budgets übrig. Möchten Sie Ihr Budget erhöhen? (y/N): ");
                char mehrGeld = tastatur.next().charAt(0);
                if (mehrGeld == 'y') {
                    System.out.print("Bitte geben sie den Betrag in € an, die sie dem Budget hinzufügen wollen: ");
                    double extrageld = tastatur.nextDouble();
                    geldbeutel = geldbeutel + extrageld;
                }
                else {
                    nachHause = true;
                }
            }
            else {
                System.out.print("Wollen sie ein weiteres Land bereisen? (Y/n): ");
                char weiterReisen = tastatur.next().charAt(0);
                if (weiterReisen == 'n') {
                    nachHause = true;
                }
            }


        }
        System.out.println("\nWir wünschen Ihnen eine gute Heimreise.");
        tastatur.close();
    }

    static double toDollar(double euro){
        return euro*0.98;
    }

    static double toYen(double euro){
        return euro*191;
    }

    static double toPfund(double euro){
        return euro*0.88;
    }

    static double toFranken(double euro){
        return euro*0.96;
    }

    static double toKrone(double euro){
        return euro*7.44;
    }
}
