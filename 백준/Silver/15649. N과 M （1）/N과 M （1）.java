import java.util.*;
import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int n, m;
    static boolean[] visited;
    static ArrayDeque<Integer> stack = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n + 1];

        dfs(0);

        System.out.println(sb);
    }

    public static void dfs(int depth) {
        if (depth == m) {
            for (Integer i : stack) {
                sb.append(i).append(" ");
            }

            sb.append("\n");
            return;
        }

        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                stack.addLast(i);
                visited[i] = true;
                dfs(depth + 1);
                stack.removeLast();
                visited[i] = false;
            }
        }
    }
}
