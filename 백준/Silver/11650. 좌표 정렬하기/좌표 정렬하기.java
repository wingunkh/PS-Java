import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] a = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            a[i][0] = x;
            a[i][1] = y;
        }

        Arrays.sort(a, (x, y) -> {
            if (x[0] == y[0]) {
                return Integer.compare(x[1], y[1]);
            } else {
                return Integer.compare(x[0], y[0]);
            }
        });

        for (int[] ints : a) {
            sb.append(ints[0]).append(" ").append(ints[1]).append("\n");
        }

        System.out.println(sb);
    }
}
