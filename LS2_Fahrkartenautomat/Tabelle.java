public class Tabelle {
    public static void main (String []args){
        //Celsius-Fahrenheit-Tabelle
        System.out.printf("%-12s|%10s\n", "Fahrenheit", "Celsius");
        System.out.println("-----------------------");
        System.out.printf("%-12.0f|%10.2f\n", -20.0, -28.8889);
        System.out.printf("%-12.0f|%10.2f\n", -10.0, -23.3333);
        System.out.printf("%-12.0f|%10.2f\n", 0.0, -17.7778);
        System.out.printf("%-12.0f|%10.2f\n", 20.0, -6.6667);
        System.out.printf("%-12.0f|%10.2f\n", 30.0, -1.1111);
    }
}
