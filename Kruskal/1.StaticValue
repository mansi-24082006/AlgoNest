import java.util.*;
class Kruskal {
    static int[] parent;
    static int find(int i) {
        return parent[i] == i ? i : (parent[i] = find(parent[i]));
    }
    static void union(int u, int v) {
        parent[find(u)] = find(v);
    }
    public static void main(String[] args) {
        int V = 7; // total number of vertices (0 to 6)
        // Each edge is represented as {u, v, weight}
        int[][] edges = {
            {0, 1, 1}, {0, 3, 4},
            {1, 2, 2}, {1, 3, 6}, {1, 4, 4},
            {2, 4, 5}, {2, 5, 6},
            {3, 4, 3}, {3, 6, 4},
            {4, 5, 8}, {4, 6, 7},
            {5, 6, 3}
        };
        Arrays.sort(edges, Comparator.comparingInt(a -> a[2]));
        parent = new int[V];
        for (int i = 0; i < V; i++) parent[i] = i;
        int cost = 0;
        System.out.println("Edge\t:\tWeight");
        for (int[] e : edges) {
            int u = e[0], v = e[1], w = e[2];
            if (find(u) != find(v)) {
                System.out.println(u + " - " + v + "\t:\t" + w);
                cost += w;
                union(u, v);
            }
        }
        System.out.println("Total weight of MST = " + cost);
    }
}

////////////////////output
Edge	:	Weight
0 - 1	:	1
1 - 2	:	2
3 - 4	:	3
5 - 6	:	3
0 - 3	:	4
3 - 6	:	4
Total weight of MST = 17

=== Code Execution Successful ===
