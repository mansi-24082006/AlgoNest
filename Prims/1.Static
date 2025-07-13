//static value of graph index..

public class Prims {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;// user-defined maximum to represent no connection
        // Example Graph (input)
        int[][] graph = {
            { max, 1,   max, 4,   max, max, max },
            { 1,   max, 2,   6,   4,   max, max },
            { max, 2,   max, max, 5,   6,   max },
            { 4,   6,   max, max, 3,   max, 4 },
            { max, 4,   5,   3,   max, 8,   7 },
            { max, max, 6,   max, 8,   max, max },
            { max, max, max, 4,   7,   3,   max },
        };
        int n = graph.length;
        boolean[] visited = new boolean[n];
        visited[0] = true; // Start from node 0

        int edgeCount = 0;
        int totalCost = 0;

        System.out.println("Edge\t:\tCost");

        while (edgeCount < n - 1) {
            int minWeight = max;
            int u = -1, v = -1;

            // Find the smallest edge from visited to unvisited
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

            // Add edge to MST
            System.out.println(u + " - " + v + "\t:\t" + minWeight);
            visited[v] = true;
            totalCost += minWeight;
            edgeCount++;
        }

        System.out.println("Total Cost = " + totalCost);
    }
}



///////////////////////Output
Edge	:	Cost
0 - 1	:	1
1 - 2	:	2
0 - 3	:	4
3 - 4	:	3
3 - 6	:	4
6 - 5	:	3
Total Cost = 17

=== Code Execution Successful ===
