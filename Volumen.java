public class Volumen {
    public static void main (String[] args) {
        int x = 3;
        System.out.println("Ein Würfel mit einer Kantenlänge von "+ x +"m hat ein Volumen von "+ volume(x) +"m³.");
        x = 10;
        System.out.println("Ein Würfel mit einer Kantenlänge von "+ x +"cm hat ein Volumen von "+ volume(x) +"cm³.");
    }

    public static int volume(int kante){
        return kante*kante*kante;
    }
}
