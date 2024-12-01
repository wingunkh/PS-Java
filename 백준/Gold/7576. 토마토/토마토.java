import java.util.*;
import java.io.*;

public class Main {
    static int n, m;
    static int[][] a;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        a = new int[n][m];
        int result = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 0) {
                    System.out.println(-1);

                    return;
                } else {
                    result = Math.max(result, a[i][j]);
                }
            }
        }

        System.out.println(result - 1);
    }

    public static void bfs() {
        ArrayDeque<int[]> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 1) {
                    q.addLast(new int[]{i, j});
                }
            }
        }

        while (!q.isEmpty()) {
            int[] now = q.removeFirst();
            int r = now[0];
            int c = now[1];

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (!(0 <= nr & nr < n && 0 <= nc && nc < m)) {
                    continue;
                }

                if (a[nr][nc] == 0) {
                    q.addLast(new int[]{nr, nc});
                    a[nr][nc] = a[r][c] + 1;
                }
            }
        }
    }
}
