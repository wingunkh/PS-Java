import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] a = new int[n][n];
        int[][] dp = new int[n][n];
        int result = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < i + 1; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = a[0][0];

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                dp[i][j] = a[i][j];

                if (j == 0) {
                    dp[i][j] += dp[i - 1][j];
                } else if (j == i) {
                    dp[i][j] += dp[i - 1][j - 1];
                } else {
                    dp[i][j] += Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            result = Math.max(result, dp[n - 1][i]);
        }

        System.out.println(result);
    }
}
