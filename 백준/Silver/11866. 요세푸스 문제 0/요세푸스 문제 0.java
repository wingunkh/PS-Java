import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayDeque<Integer> q = new ArrayDeque<>();

        for (int i = 1; i < n + 1; i++) {
            q.addLast(i);
        }

        while (!q.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                q.addLast(q.removeFirst());
            }

            sb.append(q.removeFirst());

            if (!q.isEmpty()) {
                sb.append(", ");
            }
        }

        System.out.println("<" + sb + ">");
    }
}
