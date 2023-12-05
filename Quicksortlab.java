package new_java_lab;
import java.util.Scanner;

public class Quicksortlab {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int limit = sc.nextInt();

        int[] x = new int[limit];

        System.out.print("Enter the elements: ");
        for (int i=0;i<limit;i++)
            x[i] = sc.nextInt();

        quickSort(x,0,limit-1);

        System.out.print("Sorted elements: ");
        for (int i= 0;i<limit;i++)
            System.out.print(" " + x[i]);

        
    }

    public static void quickSort(int[] x, int first, int last) {
        if (first < last) {
            int pivotIndex = partition(x, first, last);
            quickSort(x, first, pivotIndex - 1);
            quickSort(x, pivotIndex + 1, last);
        }
    }

    public static int partition(int[] x, int low, int high) {
        int pivot = x[low];
        int i = low+1;
        int j = high;

        while (i<=j) {
            while (i<=j && x[i] <= pivot)
                i++;
            while (i <= j && x[j] > pivot)
                j--;

            if (i<j){
                int temp = x[i];
                x[i] = x[j];
                x[j] = temp;
            }
        }

        int temp = x[low];
        x[low] = x[j];
        x[j] = temp;

        return j;
    }
}
