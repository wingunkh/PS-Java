import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] a = new int[n][3];
        // dp[i][j] = i번째 집을 j번째 색으로 칠할 때 드는 비용의 최솟값
        int[][] dp = new int[n][3];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 3; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = a[0][0];
        dp[0][1] = a[0][1];
        dp[0][2] = a[0][2];

        for (int i = 1; i < n; i++) {
            dp[i][0] = a[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = a[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = a[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }

        System.out.println(Math.min(Math.min(dp[n - 1][0], dp[n - 1][1]), dp[n - 1][2]));
    }
}
