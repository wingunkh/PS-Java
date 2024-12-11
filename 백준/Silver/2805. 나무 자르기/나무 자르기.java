import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        long result = 0;

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        long left = 1 ;
        long right = 2000000000;

        while (left <= right) {
            long center = (left + right) / 2;
            long sum = 0;

            for (int i : a) {
                if (i > center) {
                    sum += i - center;
                }
            }

            if (sum >= m) {
                result = Math.max(result, center);
                left = center + 1;
            } else {
                right = center - 1;
            }
        }

        System.out.println(result);
    }
}
