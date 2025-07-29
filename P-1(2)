package javaapplication;
import java.util.Scanner;

public class Selection {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            int min = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            if(min != i) {
                swap(arr, i, min);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements for selection sort: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " Integers:");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        long startTime = System.nanoTime();
        selectionSort(arr);
        long endTime = System.nanoTime();
        System.out.println("Sorted Array:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        long duration = endTime - startTime;
        System.out.println("Selection Sort took " + duration + " nanoseconds.");
    }
}







////////////////Output
Enter the number of elements for selection sort: 6
Enter 6 Integers:
7 4 10 8 3 1 
Sorted Array:
1 3 4 7 8 10 
Selection Sort took 11510 nanoseconds.

=== Code Execution Successful ===
