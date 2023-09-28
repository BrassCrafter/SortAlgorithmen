//CHATGP's Lösung des Problems
public class MergeSort {

    // Methode zum Zusammenführen zweier sortierter Arrays
    private static void merge(int[] arr, int left, int middle, int right) {
        // Größe der beiden zu mergenden Teile berechnen
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Temporäre Arrays erstellen
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Daten in die temporären Arrays kopieren
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = arr[middle + 1 + i];
        }

        // Zusammenführen der beiden temporären Arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Verbleibende Elemente kopieren (falls vorhanden)
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Hauptmethode für den Mergesort-Algorithmus
    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Den mittleren Punkt berechnen
            int middle = (left + right) / 2;

            // Rekursiv die linke und rechte Hälfte sortieren
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            // Die beiden sortierten Hälften zusammenführen
            merge(arr, left, middle, right);
        }
    }

    // Öffentliche Methode zum Aufrufen des Mergesort-Algorithmus
    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        mergeSort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {33, 6, 123, 9, -3, 5, 222, 223 ,221, 0, 0, 5, 5, 6, 5, 9, 10000, 109};
        System.out.println("Unsortiertes Array:");
        printArray(arr);

        MergeSort.sort(arr);

        System.out.println("Sortiertes Array:");
        printArray(arr);
    }

    // Hilfsmethode zum Anzeigen eines Arrays
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " | ");
        }
        System.out.println();
    }
}
