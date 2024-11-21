import java.util.*;
import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int n, m, v;
    static ArrayList<ArrayList<Integer>> a = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st1.nextToken());
        m = Integer.parseInt(st1.nextToken());
        v = Integer.parseInt(st1.nextToken());

        for (int i = 0; i < n + 1; i++) {
            a.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st2.nextToken());
            int end = Integer.parseInt(st2.nextToken());
            a.get(start).add(end);
            a.get(end).add(start);
        }

        for (ArrayList<Integer> i : a) {
            Collections.sort(i);
        }

        visited = new boolean[n + 1];
        Dfs(v);

        sb.append("\n");

        visited = new boolean[n + 1];
        Bfs(v);

        System.out.println(sb);
    }

    public static void Dfs(int v) {
        visited[v] = true;
        sb.append(v).append(' ');

        for (int next : a.get(v)) {
            if (!visited[next]) {
                Dfs(next);
            }
        }
    }

    public static void Bfs(int v) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.addLast(v);
        visited[v] = true;
        sb.append(v).append(' ');

        while (!q.isEmpty()) {
            int now = q.removeFirst();

            for (int next : a.get(now)) {
                if (!visited[next]) {
                    q.addLast(next);
                    visited[next] = true;
                    sb.append(next).append(' ');
                }
            }
        }
    }
}
