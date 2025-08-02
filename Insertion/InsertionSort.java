import java.util.Scanner;

public class InsertionSort {

    // Insertion Sort algorithm with step-by-step output
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        System.out.println("\n--- Insertion Sort Steps ---");
        for (int i = 1; i < n; i++) {
            int key = arr[i];  // The value to be inserted
            int j = i - 1;

            // Shift elements that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Place key in its correct location
            arr[j + 1] = key;

            // Print array after each pass
            System.out.print("Pass " + i + ": ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input size
        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Step 2: Input array values
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Measure time and sort
        long startTime = System.nanoTime();
        insertionSort(arr);
        long endTime = System.nanoTime();

        // Step 4: Output sorted array
        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Step 5: Time taken in different units
        long durationNano = endTime - startTime;
      

        System.out.println("\n\nInsertion Sort Time Taken:");
        System.out.println("- " + durationNano + " nanoseconds");
        
    }
}











////////////////Output
Enter number of elements: 6
Enter 6 integers:
10 9 2 4 1 14 20

--- Insertion Sort Steps ---
Pass 1: 9 10 2 4 1 14 
Pass 2: 2 9 10 4 1 14 
Pass 3: 2 4 9 10 1 14 
Pass 4: 1 2 4 9 10 14 
Pass 5: 1 2 4 9 10 14 

Sorted Array:
1 2 4 9 10 14 

Insertion Sort Time Taken:
- 1966930 nanoseconds

=== Code Execution Successful ===
