public class Schleifen { 
    public static void main (String[] args) {
        int i = 9;
        while(i <= 20) {
            i = i+1;
            if (i == 11){
                continue;
            }
            else if (i == 18){
                break;
            }
            System.out.printf("%d²=%d ", i,  i*i);
        }
    }
}
