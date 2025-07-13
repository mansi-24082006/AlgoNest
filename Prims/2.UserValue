//Enter user value of graph index...

import java.util.Scanner;
public class Prims {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MAX_VALUE; // Represents no connection

        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();

        int[][] graph = new int[n][n];
        boolean[] visited = new boolean[n];

        System.out.println("Enter the graph as an adjacency matrix:");
        System.out.println("Use a large number (like 9999) or -1 if nodes are not directly connected.");

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Weight between " + i + " and " + j + ": ");
                int value = sc.nextInt();
                if (value <= 0) {
                    graph[i][j] = max; // no connection
                } else {
                    graph[i][j] = value;
                }
            }
        }
        visited[0] = true; // Start with the first node
        int edgeCount = 0;
        int totalCost = 0;
        System.out.println("\nEdge\t:\tCost");
        while (edgeCount < n - 1) {
            int minWeight = max;
            int u = -1, v = -1;

            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    for (int j = 0; j < n; j++) {
                        if (!visited[j] && graph[i][j] < minWeight) {
                            minWeight = graph[i][j];
                            u = i;
                            v = j;
                        }
                    }
                }
            }
            if (u != -1 && v != -1) {
                System.out.println(u + " - " + v + "\t:\t" + minWeight);
                visited[v] = true;
                totalCost += minWeight;
                edgeCount++;
            } else {
                System.out.println("Graph is not connected.");
                break;
            }
        }
        System.out.println("Total Cost = " + totalCost);
        sc.close();
    }
}

////////////////////////Output
Enter the number of nodes: 7
Enter the graph as an adjacency matrix:
Use a large number (like 9999) or -1 if nodes are not directly connected.
Weight between 0 and 0: -1
Weight between 0 and 1: 1
Weight between 0 and 2: -1
Weight between 0 and 3: 4
Weight between 0 and 4: -1
Weight between 0 and 5: -1
Weight between 0 and 6: -1
Weight between 1 and 0: 1
Weight between 1 and 1: -1
Weight between 1 and 2: 2
Weight between 1 and 3: 6
Weight between 1 and 4: 4
Weight between 1 and 5: -1
Weight between 1 and 6: -1
Weight between 2 and 0: -1
Weight between 2 and 1: 2
Weight between 2 and 2: -1
Weight between 2 and 3: -1
Weight between 2 and 4: 5
Weight between 2 and 5: 6
Weight between 2 and 6: -1
Weight between 3 and 0: 4
Weight between 3 and 1: 6
Weight between 3 and 2: -1
Weight between 3 and 3: -1
Weight between 3 and 4: 3
Weight between 3 and 5: -1
Weight between 3 and 6: 4
Weight between 4 and 0: -1
Weight between 4 and 1: 4
Weight between 4 and 2: 5
Weight between 4 and 3: 3
Weight between 4 and 4: -1
Weight between 4 and 5: 8
Weight between 4 and 6: 7
Weight between 5 and 0: -1
Weight between 5 and 1: -1
Weight between 5 and 2: 6
Weight between 5 and 3: -1
Weight between 5 and 4: 8
Weight between 5 and 5: -1
Weight between 5 and 6: 3
Weight between 6 and 0: -1
Weight between 6 and 1: -1
Weight between 6 and 2: -1
Weight between 6 and 3: 4
Weight between 6 and 4: 7
Weight between 6 and 5: 3
Weight between 6 and 6: -1

Edge	:	Cost
0 - 1	:	1
1 - 2	:	2
0 - 3	:	4
3 - 4	:	3
3 - 6	:	4
6 - 5	:	3
Total Cost = 17

=== Code Execution Successful ===

