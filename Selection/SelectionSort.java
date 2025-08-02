package javaapplication;
import java.util.Scanner;

public class Selection {

    // Swap helper function
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Selection Sort algorithm with pass display
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        int passCount = 0;

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            // Find the minimum in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swap only if a smaller element is found
            if (min != i) {
                swap(arr, i, min);
            }

            // Increment pass count
            passCount++;

            // Print array after each pass
            System.out.print("Pass " + passCount + ": ");
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        System.out.println("Total passes: " + passCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input section
        System.out.print("Enter the number of elements for selection sort: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Time measurement
        long startTime = System.nanoTime();
        selectionSort(arr);
        long endTime = System.nanoTime();

        // Output sorted array
        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Calculate time taken
        long durationNano = endTime - startTime;
        

        // Display timing in various units
        System.out.println("\nSelection Sort Execution Time:");
        System.out.println("- " + durationNano + " nanoseconds");
    }
}













//////////////////Output
Enter the number of elements for selection sort: 6
Enter 6 integers:
7 4 10 8 3 1
Pass 1: 1 4 10 8 3 7 
Pass 2: 1 3 10 8 4 7 
Pass 3: 1 3 4 8 10 7 
Pass 4: 1 3 4 7 10 8 
Pass 5: 1 3 4 7 8 10 
Total passes: 5

Sorted Array:
1 3 4 7 8 10 

Selection Sort Execution Time:
- 1626459 nanoseconds

=== Code Execution Successful ===
