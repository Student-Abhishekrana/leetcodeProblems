class Solution {
    public static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static class Info {
        int vertex;
        int cost;
        int stops;

        public Info(int vertex, int cost, int stops) {
            this.vertex = vertex;
            this.cost = cost;
            this.stops = stops;
        }

    }

    public static void createGraph(ArrayList<Edge>[] graph, int[][] flight) {
        int v = graph.length;

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < flight.length; i++) {
            int src = flight[i][0];
            int dest = flight[i][1];
            int weight = flight[i][2];

            Edge e = new Edge(src, dest, weight);
            graph[src].add(e);
        }

    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<Edge>[] graph = new ArrayList[n];
        createGraph(graph, flights);

        int dist[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (src != i) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();

            if (curr.stops > k) {
                continue;
            }
            for (int i = 0; i < graph[curr.vertex].size(); i++) {
                Edge e = graph[curr.vertex].get(i);
                int u = e.src;
                int v = e.dest;
                int wgt = e.weight;

                if (curr.cost + wgt < dist[v] && curr.stops <= k) {
                    dist[v] = curr.cost + wgt;
                    q.add(new Info(v, dist[v], curr.stops + 1));
                }
            }
        }
        if (dist[dst] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return dist[dst];
        }

    }
}