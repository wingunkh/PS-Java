import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] a = new int[101][101];
        int result = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            for (int j = r; j < r + 10; j++) {
                for (int k = c; k < c + 10; k++) {
                    a[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (a[i][j] == 1) {
                    result += 1;
                }
            }
        }

        System.out.println(result);
    }
}
