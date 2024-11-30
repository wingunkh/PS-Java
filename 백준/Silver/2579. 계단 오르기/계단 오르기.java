import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[301];
        // dp[i] = i번째 계단을 마지막으로 밟았을 때 얻을 수 있는 점수의 최댓값
        int[] dp = new int[301];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = a[0];
        dp[1] = a[0] + a[1];
        dp[2] = Math.max(a[0] + a[2], a[1] + a[2]);

        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(dp[i - 2] + a[i], dp[i - 3] + a[i - 1] + a[i]);
        }

        System.out.println(dp[n - 1]);
    }
}
