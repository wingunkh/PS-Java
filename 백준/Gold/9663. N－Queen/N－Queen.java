import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int[][] a;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        a = new int[n][n];

        dfs(0);

        System.out.println(result);
    }

    public static void dfs(int depth) {
        if (depth == n) {
            result += 1;
            return;
        }

        for (int i = 0; i < n; i++) {
            a[depth][i] = 1;

            if (check(depth, i)) {
                dfs(depth + 1);
            }

            a[depth][i] = 0;
        }
    }
    
    public static boolean check(int r, int c) {
        // 상단 열 검사
        for (int i = 0; i < r; i++) {
            if (a[i][c] == 1) {
                return false;
            }
        }

        // 상단 왼쪽 대각선 검사
        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if (a[i][j] == 1) {
                return false;
            }
        }

        // 상단 오른쪽 대각선 검사
        for (int i = r - 1, j = c + 1; i >= 0 && j < n; i--, j++) {
            if (a[i][j] == 1) {
                return false;
            }
        }

        return true;
    }
}
