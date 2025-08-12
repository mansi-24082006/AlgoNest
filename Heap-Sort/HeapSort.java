package javaapplication;
import java.util.Scanner;

public class P5 {

    public static void MaxHeapify(int[] a, int i, int n) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && a[l] > a[largest]) {
            largest = l;
        }
        if (r < n && a[r] > a[largest]) {
            largest = r;
        }
        if (largest != i) {
            // Swap
            int temp = a[largest];
            a[largest] = a[i];
            a[i] = temp;

            System.out.println("MaxHeapify swap at index " + i + " with index " + largest + ":");
            printArray(a);

            MaxHeapify(a, largest, n);  // Recursive call with print on swaps
        }
    }

    public static void HeapSort(int[] a, int n) {
        // Build max heap
        System.out.println("Building max heap...");
        for (int i = n / 2 - 1; i >= 0; i--) {
            MaxHeapify(a, i, n);
        }
        System.out.println("After building max heap:");
        printArray(a);

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            System.out.println("After moving max element to position " + i + ":");
            printArray(a);

            // call max heapify on the reduced heap
            MaxHeapify(a, 0, i);

            System.out.println("After pass " + (n - i) + ":");
            printArray(a);
        }
    }

    public static void printArray(int[] a) {
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        HeapSort(a, n);

        System.out.println("Sorted array:");
        printArray(a);
    }
}






Enter the number of elements:
4
Enter the elements:
6
7
3

8
Building max heap...
MaxHeapify swap at index 1 with index 3:
6 8 3 7 
MaxHeapify swap at index 0 with index 1:
8 6 3 7 
MaxHeapify swap at index 1 with index 3:
8 7 3 6 
After building max heap:
8 7 3 6 
After moving max element to position 3:
6 7 3 8 
MaxHeapify swap at index 0 with index 1:
7 6 3 8 
After pass 1:
7 6 3 8 
After moving max element to position 2:
3 6 7 8 
MaxHeapify swap at index 0 with index 1:
6 3 7 8 
After pass 2:
6 3 7 8 
After moving max element to position 1:
3 6 7 8 
After pass 3:
3 6 7 8 
Sorted array:
3 6 7 8 

=== Code Execution Successful ===
