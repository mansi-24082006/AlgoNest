package javaapplication;
import java.util.Scanner;

public class QuickSort {

    static int passCount = 1;

    public static void quickSort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int loc = partition(arr, lb, ub);

            // Print the pass number, partition index, and current array state
            System.out.print("Pass " + passCount++ + " (pivot index = " + loc + "): ");
            printArray(arr);

            quickSort(arr, lb, loc - 1);
            quickSort(arr, loc + 1, ub);
        }
    }

    public static int partition(int[] a, int lb, int ub) {
        int pivot = a[lb];
        int start = lb;
        int end = ub;

        while (start < end) {
            while (start <= ub && a[start] <= pivot) {
                start++;
            }
            while (a[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }

        // Swap pivot with a[end]
        int temp = a[lb];
        a[lb] = a[end];
        a[end] = temp;

        return end;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        long startTime = System.nanoTime();
        quickSort(arr, 0, n - 1);
        long endTime = System.nanoTime();

        System.out.println("Sorted array:");
        printArray(arr);

        long duration = endTime - startTime;
        System.out.println("Quick Sort took " + duration + " nanoseconds.");

        scanner.close();
    }
}



///////////////////Output
debug:
Enter the number of elements: 5
Enter 5 integers:
40
30
50
20
10
Pass 1 (pivot index = 3): 20 30 10 40 50 
Pass 2 (pivot index = 1): 10 20 30 40 50 
Sorted array:
10 20 30 40 50 
Quick Sort took 173301 nanoseconds.
BUILD SUCCESSFUL (total time: 20 seconds)
