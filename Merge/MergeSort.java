package javaapplication;
import java.util.Scanner;

public class Merge {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);

            // Print the array after each merge (pass)
            System.out.print("After merging from index " + left + " to " + right + ": ");
            printArray(arr);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        long startTime = System.nanoTime();

        mergeSort(arr, 0, arr.length - 1);

        long endTime = System.nanoTime();

        System.out.println("Sorted array:");
        printArray(arr);

        long duration = endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + duration);

        scanner.close();
    }
}







///////////////////Output
debug:
Enter number of elements: 5
Enter 5 numbers:
8
3
7
2
5
After merging from index 0 to 1: 3 8 7 2 5 
After merging from index 0 to 2: 3 7 8 2 5 
After merging from index 3 to 4: 3 7 8 2 5 
After merging from index 0 to 4: 2 3 5 7 8 
Sorted array:
2 3 5 7 8 
Execution time in nanoseconds: 227799
BUILD SUCCESSFUL (total time: 9 seconds)
