import java.util.*;

public class TopologicalSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Map<Integer, List<Integer>> graph = new HashMap<>();
        int[] indegree = new int[n];

        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter edges (format: A B means A → B):");
        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            indegree[b]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) q.add(i);
        }

        System.out.println("\n=== TOPOLOGICAL SORT RESULT ===");
        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");
            for (int nxt : graph.get(node)) {
                indegree[nxt]--;
                if (indegree[nxt] == 0) q.add(nxt);
            }
        }
    }
}
