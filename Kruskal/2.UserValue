import java.util.*;

class Kruskal {
    static int[] parent;

    // Find with path compression
    static int find(int i) {
        return parent[i] == i ? i : (parent[i] = find(parent[i]));
    }

    // Union two subsets
    static void union(int u, int v) {
        parent[find(u)] = find(v);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        int[][] edges = new int[E][3];
        System.out.println("Enter each edge as: source destination weight");

        for (int i = 0; i < E; i++) {
            System.out.print("Edge " + (i + 1) + ": ");
            edges[i][0] = sc.nextInt(); // source
            edges[i][1] = sc.nextInt(); // destination
            edges[i][2] = sc.nextInt(); // weight
        }

        // Sort edges by weight
        Arrays.sort(edges, Comparator.comparingInt(a -> a[2]));

        parent = new int[V];
        for (int i = 0; i < V; i++) parent[i] = i;

        int cost = 0;
        System.out.println("\nEdge\t:\tWeight");

        for (int[] e : edges) {
            int u = e[0], v = e[1], w = e[2];
            if (find(u) != find(v)) {
                System.out.println(u + " - " + v + "\t:\t" + w);
                cost += w;
                union(u, v);
            }
        }

        System.out.println("Total weight of MST = " + cost);
        sc.close();
    }
}



//////////////////OutPut

Enter number of vertices: 7
Enter number of edges: 12
Enter each edge as: source destination weight
Edge 1: 0 1 1
Edge 2: 0 3 4
Edge 3: 1 2 2
Edge 4: 1 3 6
Edge 5: 1 4 4
Edge 6: 2 4 5
Edge 7: 2 5 6
Edge 8: 3 4 3
Edge 9: 3 6 4
Edge 10: 4 5 8
Edge 11: 4 6 7
Edge 12: 5 6 3

Edge	:	Weight
0 - 1	:	1
1 - 2	:	2
3 - 4	:	3
5 - 6	:	3
0 - 3	:	4
3 - 6	:	4
Total weight of MST = 17

=== Code Execution Successful ===
