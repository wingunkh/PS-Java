import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            ArrayDeque<int[]> q = new ArrayDeque<>();
            int result = 0;

            for (int j = 0; j < n; j++) {
                int priority = Integer.parseInt(st.nextToken());
                q.addLast(new int[]{priority, j});
            }

            while (true) {
                int maximum = 0;

                for (int[] ints : q) {
                    maximum = Math.max(maximum, ints[0]);
                }

                int[] target = q.removeFirst();

                if (target[0] == maximum) {
                    result += 1;

                    if (target[1] == m) {
                        break;
                    }
                } else {
                    q.addLast(target);
                }
            }

            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }
}
