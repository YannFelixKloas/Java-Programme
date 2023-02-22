public class EinMalEins { 
    public static void main (String[] args) {
        for (int x = 1; x <= 10; x++){
            for (int y = 1; y <= 10; y++){
                int result = x * y;
                System.out.print(result + "\t");
            }
            System.out.print("\n");
        }
    }
}
