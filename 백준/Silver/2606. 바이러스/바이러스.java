import java.util.*;
import java.io.*;

public class Main {
    static int n, m;
    static List<List<Integer>> a = new ArrayList<>();
    static boolean[] visited;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        for (int i = 0; i < n + 1; i++) {
            a.add(new ArrayList<>());
        }

        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            a.get(s).add(e);
            a.get(e).add(s);
        }

        Dfs(1);

        System.out.println(result - 1);
    }
    
    public static void Dfs(int v) {
        visited[v] = true;
        result += 1;

        for (int next : a.get(v)) {
            if (!visited[next]) {
                Dfs(next);
            }
        }
    }
}
