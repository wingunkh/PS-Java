import java.util.*;
import java.io.*;

public class Main {
    static int n, m, k;
    static int[][] a;
    static boolean[][] visited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            a = new int[n][m];
            visited = new boolean[n][m];
            int result = 0;

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int r = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());

                a[r][c] = 1;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (a[i][j] == 1 && !visited[i][j]) {
                        result += 1;
                        bfs(i, j);
                    }
                }
            }

            System.out.println(result);
        }
    }

    public static void bfs(int x, int y) {
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.addLast(new int[]{x, y});
        visited[x][y] = true;

        while (!q.isEmpty()) {
            int[] now = q.removeFirst();
            int r = now[0];
            int c = now[1];

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (!(0 <= nr && nr < n && 0 <= nc && nc < m)) {
                    continue;
                }

                if (a[nr][nc] == 1 && !visited[nr][nc]) {
                    q.addLast(new int[]{nr, nc});
                    visited[nr][nc] = true;
                }
            }
        }
    }
}
