public class SelectionSort {
    public static void main (String[] args){
        int[] liste = {4, 2, 10, 3, -5, 0, 17};
        for(int pos = 0; pos < liste.length; pos++){
            int curr = liste[pos];
            int posmin = findmin(liste, pos);
            liste[pos] = liste[posmin];
            liste[posmin] = curr;
        }

        //Ausgabe-Schleife
        for(int x = 0; x < liste.length; x++){
            System.out.print(liste[x] + ", ");
        }
        System.out.print("\n");
    }

    static int findmin(int[] arr, int pos){
        int min = Integer.MAX_VALUE;
        int posmin = -1;

        for (int i = pos; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
                posmin = i;
            }
        }
        return posmin;
    }
}
