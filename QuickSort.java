import java.util.Scanner;
import java.util.Random;

public class QuickSort {

    public static void sort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }

    public static void quicksort(int[] arr, int low, int high) {
        int i = low, j = mid;
        int temp;
        int pivot = arr[low];
        while (i <= j) {
            while (pivot>arr[i])
                i++;
            while ( pivot<arr[j])
                j--;
            if (i <= j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quicksort(arr, low, j);
        if (i < high)
            quicksort(arr, i, high);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Quick sort");
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(10000);
            System.out.println(arr[i]);
        }
        long StartTime = System.nanoTime();
        sort(arr);
        double EndTime = System.nanoTime();
        double TotalTime = (EndTime - StartTime) / 1000000;
        System.out.println();
        System.out.println("Array after sort");
        for (int i = 0; i < 10; i++)
            System.out.println(arr[i] + " ");
        System.out.println();
        System.out.println("Total time to Quick Sort is:" + TotalTime + " " + "miliseconds");
        s.close();
    }

}
