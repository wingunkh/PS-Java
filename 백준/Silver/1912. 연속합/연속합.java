import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        // dp[i] = i번째 수로 끝나는 수열의 최대 연속합
        int[] dp = new int[n];
        int result = -Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = a[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(a[i], a[i] + dp[i - 1]);
        }

        for (int i : dp) {
            result = Math.max(result, i);
        }

        System.out.println(result);
    }
}
