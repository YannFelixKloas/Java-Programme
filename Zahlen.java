public class Zahlen {
    public static void main (String[] args){     
        int[] zahlen = {3, 4, 2, 3, 5, 1, 2, 7, 2, 1, 2, 4};
        int[] haeufigkeit = new int[100]; //Die Länge setzt die grösste erlaubte Zahl fest, in dem Fall 99

        for (int i = 0; i < zahlen.length; i++){
            haeufigkeit[zahlen[i]]++;
        }

        int biggest = 0;
        int posbiggest = 0;
        for (int j = 0; j < haeufigkeit.length; j++){
            if (haeufigkeit[j] > biggest){
                biggest = haeufigkeit[j];
                posbiggest = j;
            }
        }

        System.out.println("Die Zahl " + posbiggest + " kommt " + biggest + " mal vor und ist damit am häufigsten.");
    }
}
