package javaapplication;
import java.util.Scanner;
public class Practical1 {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;}
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        long startTime = System.nanoTime();
        bubbleSort(arr);
        long endTime = System.nanoTime();
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        long duration = endTime - startTime;
        System.out.println("Bubble Sort took " + duration + " nanoseconds.");
    }
}












///////////Output
Enter the number of elements: 5
Enter 5 integers:
34 12 9 76 3
Sorted array:
3 9 12 34 76 
Bubble Sort took 132400 nanoseconds.
