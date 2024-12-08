import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // dp[i][j] = i개의 수 중 j개의 수를 선택하는 경우의 수
        int[][] dp = new int[31][31];

        for (int i = 0; i < 31; i++) {
            dp[i][0] = 1;
            dp[i][1] = i;
            dp[i][i] = 1;
        }

        for (int i = 2; i < 31; i++) {
            for (int j = 2; j < i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            sb.append(dp[m][n]).append("\n");
        }

        System.out.println(sb);
    }
}
