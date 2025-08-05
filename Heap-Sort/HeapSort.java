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
            int temp = a[largest];
            a[largest] = a[i];
            a[i] = temp;
            MaxHeapify(a, largest, n);  // <-- recursive call fixed here
        }
    }

    public static void HeapSort(int[] a, int n) {
        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            MaxHeapify(a, i, n);
        }
        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            // call max heapify on the reduced heap
            MaxHeapify(a, 0, i);
        }
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
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}










/////////////////Output
debug:
Enter the number of elements:
5
Enter the elements:
5 4 6 8 2 
Sorted array:
2 4 5 6 8 
BUILD SUCCESSFUL (total time: 11 seconds)
