public class SortingAlgorithms {
    public static int[] bubbleSort(int[] usf) {
        int[] sf = usf;
        for (int i = 0; i < sf.length; i++) {
            for (int j = 1; j < sf.length; j++) {
                if (sf[j] < sf[j - 1]) {
                    int tempInt = sf[j - 1];
                    sf[j - 1] = sf[j];
                    sf[j] = tempInt;
                }
            }
        }
        return sf;
    }
    public static void insertionSort(int[] usf){
        int i = 0;
        i=+2;
        System.out.println(i);
    }
}
