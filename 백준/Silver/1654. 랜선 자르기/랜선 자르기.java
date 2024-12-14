import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long[] a = new long[n];
        long result = 0;

        long left = 1;
        long right = 0;

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
            right = Math.max(right, a[i]);
        }

        while (left <= right) {
            long center = (left + right) / 2;
            long count = 0;

            for (long l : a) {
                count += l / center;
            }

            if (count >= k) {
                left = center + 1;
                result = Math.max(result, center);
            } else {
                right = center - 1;
            }
        }

        System.out.println(result);
    }
}
