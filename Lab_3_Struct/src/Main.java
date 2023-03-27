import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Goods[] GoodsBubbleSort;
        GoodsBubbleSort = ManagerOfMethods.readingFIle();

        System.out.println("\nBubble Sort: ");
        ManagerOfMethods.bubbleSort(GoodsBubbleSort);
//        ManagerOfMethods.printing(studentBubbleSort);


        Goods[] studentInsertionSort;
        studentInsertionSort = ManagerOfMethods.readingFIle();

        System.out.println("\nInsertion Sort: ");
        ManagerOfMethods.insertionSort(studentInsertionSort);
//        ManagerOfMethods.printing(studentInsertionSort);


        Goods[] GoodsSelectionSort;
        GoodsSelectionSort = ManagerOfMethods.readingFIle();

        System.out.println("\nSelection Sort: ");
        ManagerOfMethods.selectionSort(GoodsSelectionSort);
//        ManagerOfMethods.printing(studentSelectionSort);


        Goods[] GoodsShellSort;
        GoodsShellSort = ManagerOfMethods.readingFIle();

        System.out.println("\nShell Sort: ");
        ManagerOfMethods.shellSort(GoodsShellSort);
//        ManagerOfMethods.printing(studentShellSort);
    }
}