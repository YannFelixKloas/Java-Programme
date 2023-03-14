public class EAN {
    public static void main(String[] args) {
        int[][] allenummern = {{4, 7, 8, 0, 2, 0, 1, 3, 7, 9, 6, 3, 6}, {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 8}, {9, 8, 0, 7, 5, 2, 2, 4, 5, 3, 6, 9, 4}, {7, 5, 3, 9, 5, 1, 8, 5, 2, 4, 5, 6, 1}};
        for (int i = 0; i < allenummern.length; i++){
            System.out.println("EAN " + i +": " + checkEAN(allenummern[i]));
        }
    }
    
    static boolean checkEAN (int[] ean) {
        int quersumme = 0;
        for (int i = 0; i < 12; i++){
            if (i % 2 == 1) {
                ean[i] = ean[i] * 3;
            }
            quersumme = quersumme + ean[i];
        }
        int pruefziffer = 10 - (quersumme % 10);
        if (pruefziffer == ean[12]){
            return true;
        }
        else {
            return false;
        }
    }
}
