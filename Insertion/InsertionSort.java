package javaapplication;
import java.util.Scanner;

public class P2 {
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

            // Print array after each pass
            System.out.print("Pass " + i + ": ");
            printArray(arr);
        }
    }

    static void printArray(int arr[]) {
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        P2 ob = new P2();

        long startTime = System.nanoTime();  // Start time before sorting
        ob.sort(arr);
        long endTime = System.nanoTime();    // End time after sorting

        System.out.print("Final Sorted Array: ");
        printArray(arr);

        long duration = endTime - startTime;  // Duration in nanoseconds
        System.out.println("Execution time in nanoseconds: " + duration);

        sc.close();  // Close the scanner to avoid resource leak
    }
}










/////////////////Output
Enter number of elements: 5
Enter 5 integers:
3 4 2 1 6
Pass 1: 3 4 2 1 6 
Pass 2: 2 3 4 1 6 
Pass 3: 1 2 3 4 6 
Pass 4: 1 2 3 4 6 
Final Sorted Array: 1 2 3 4 6 
Execution time in nanoseconds: 5472099

=== Code Execution Successful ===
