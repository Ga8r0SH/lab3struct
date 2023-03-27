import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;

public class ManagerOfMethods {
    private static long swaps;
    private static long comparisons;

    public static Goods[] readingFIle() throws IOException {
        Goods[] Goodss = new Goods[50];

        try {
            FileReader fileReader = new FileReader("C:\\Users\\gavro\\Desktop\\Lab_3_Struct\\src\\unsorted");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            for(int i = 0; i < Goodss.length; i++) {
                Goodss[i] = new Goods();
                Goodss[i].readingFile(bufferedReader);
            }

        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }

        return Goodss;
    }

    public static void printing(Goods[] Goodss){
        Formatter form = new Formatter(System.out);
        for(int i = 0; i < Goodss.length; i++) {
            Goodss[i].writeTable(form);
        }
    }

    // Сортирую по значениям ID студентов
    public static void bubbleSort(Goods[] arr) {
        long startTime = System.nanoTime();
        long endTime;
        comparisons = swaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                comparisons++;
                if (arr[j].getID() > arr[j + 1].getID()) {
                    swaps++;
                    Goods temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        endTime = System.nanoTime();
        System.out.println("Time of execution: " + (endTime - startTime) + " Nano Seconds\n" +
                "Value of comparisons: " + comparisons + "\nValue of swaps: " + swaps);
    }

    public static void insertionSort(Goods[] arr) {
        long startTime = System.nanoTime();
        long endTime;
        comparisons = swaps = 0;

        for (int i = 1; i < arr.length; i++) {
            Goods key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getID() > key.getID()) {
                comparisons++;
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            swaps++;
        }

        endTime = System.nanoTime();
        System.out.println("Time of execution: " + (endTime - startTime) + " Nano Seconds\n" +
                "Value of comparisons: " + comparisons + "\nValue of swaps: " + swaps);
    }

    public static void selectionSort(Goods[] arr) {
        long startTime = System.nanoTime();
        long endTime;
        comparisons = swaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                comparisons++;
                if (arr[j].getID() < arr[min_idx].getID()) {
                    min_idx = j;
                }
            }
            swaps++;
            Goods temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

        endTime = System.nanoTime();
        System.out.println("Time of execution: " + (endTime - startTime) + " Nano Seconds\n" +
                "Value of comparisons: " + comparisons + "\nValue of swaps: " + swaps);
    }

    public static void shellSort(Goods[] arr) {
        long startTime = System.nanoTime();
        long endTime;
        comparisons = swaps = 0;

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                comparisons++;
                Goods temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap].getID() > temp.getID(); j -= gap) {
                    swaps++;
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }

        endTime = System.nanoTime();
        System.out.println("Time of execution: " + (endTime - startTime) + " Nano Seconds\n" +
                "Value of comparisons: " + comparisons + "\nValue of swaps: " + swaps);
    }
}
