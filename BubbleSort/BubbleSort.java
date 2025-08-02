package javaapplication;
import java.util.Scanner;

public class Practical1 {
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        int passCount = 0;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            System.out.println("Pass " + (i + 1) + ":");
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            passCount++;
            // Print array after each pass
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();

            // If no elements were swapped, array is sorted
            if (!swapped) break;
        }

        System.out.println("Total passes: " + passCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        // Input elements
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Measure time
        long startTime = System.nanoTime();
        bubbleSort(arr);
        long endTime = System.nanoTime();

        // Output sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Output time taken
        long duration = endTime - startTime;
        System.out.println("Bubble Sort took " + duration + " nanoseconds.");
    }
}



///////////////////////////Output
Enter the number of elements: 5
Enter 5 integers:
34 12 9 76 3
Pass 1:
12 9 34 3 76 
Pass 2:
9 12 3 34 76 
Pass 3:
9 3 12 34 76 
Pass 4:
3 9 12 34 76 
Total passes: 4
Sorted array:
3 9 12 34 76 
Bubble Sort took 1934590 nanoseconds.

=== Code Execution Successful ===
