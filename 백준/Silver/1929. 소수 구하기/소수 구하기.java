import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] a = new int[m + 1];

        for (int i = 2; i < m + 1; i++) {
            a[i] = i;
        }

        for (int i = 2; i < Math.sqrt(m) + 1; i++) {
            if (a[i] == 0) {
                continue;
            }

            for (int j = i + i; j < m + 1; j += i) {
                a[j] = 0;
            }
        }

        for (int i = n; i < m + 1; i++) {
            if (a[i] != 0) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}
