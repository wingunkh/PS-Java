import java.util.*;
import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int n;
    static int k;
    static ArrayDeque<Integer> stack;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        stack = new ArrayDeque<>();

        dfs(1, 0);

        System.out.println(sb);
    }

    public static void dfs(int x, int depth) {
        if (depth == k) {
            for (Integer i : stack) {
                sb.append(i).append(" ");
            }

            sb.append("\n");
            return;
        }

        for (int i = x; i < n + 1; i++) {
            stack.addLast(i);
            dfs(i, depth + 1);
            stack.removeLast();
        }
    }
}
