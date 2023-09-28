public class Testclass {
    public static void main(String[] args) {
        int[] usf = new int[100];
        usf[0] = 0;
        usf[1] = 1;
        int i = 0;
        System.out.println(usf[i++]);
        System.out.println(usf[i]);
         SortingAlgorithms.insertionSort(usf);
         while (i<10)
             System.out.println("Hallo");
    }
}
