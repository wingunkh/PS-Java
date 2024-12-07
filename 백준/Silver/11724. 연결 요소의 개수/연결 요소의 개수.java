import java.util.*;
import java.io.*;

public class Main {
    static int n, m;
    static ArrayList<ArrayList<Integer>> a = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int result = 0;

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

        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                dfs(i);
                result += 1;
            }
        }

        System.out.println(result);
    }

    public static void dfs(int v) {
        visited[v] = true;

        for (int next : a.get(v)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
