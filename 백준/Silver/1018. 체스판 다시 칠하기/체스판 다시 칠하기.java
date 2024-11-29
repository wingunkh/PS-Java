import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] a = new char[n][m];
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            for (int j = 0; j < m; j++) {
                a[i][j] = s.charAt(j);
            }
        }

        for (int r = 0; r < n - 7; r++) {
            for (int c = 0; c < m - 7; c++) {
                int startBlack = 0;
                int startWhite = 0;

                for (int i = r; i < r + 8; i++) {
                    for (int j = c; j < c + 8; j++) {
                        if ((i + j) % 2 == 0) {
                            if (a[i][j] == 'W') {
                                startBlack += 1;
                            } else {
                                startWhite += 1;
                            }
                        } else {
                            if (a[i][j] == 'W') {
                                startWhite += 1;
                            } else {
                                startBlack += 1;
                            }
                        }
                    }
                }

                result = Math.min(result, Math.min(startBlack, startWhite));
            }
        }

        System.out.println(result);
    }
}
