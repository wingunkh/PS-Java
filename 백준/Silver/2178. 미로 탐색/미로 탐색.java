import java.util.*;
import java.io.*;

public class Main {
    static int n, m;
    static int[][] a;
    static int[][] visited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        a = new int[n][m];
        visited = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            for (int j = 0; j < m; j++) {
                a[i][j] = s.charAt(j) - '0';
            }
        }

        System.out.println(Bfs());
    }

    public static int Bfs() {
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.addLast(new int[] {0, 0});
        visited[0][0] = 1;

        while (!q.isEmpty()) {
            int[] now = q.removeFirst();
            int r = now[0];
            int c = now[1];

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (r == n - 1 && c == m - 1) {
                    return visited[r][c];
                }

                if (!(0 <= nr && nr < n && 0 <= nc && nc < m)) {
                    continue;
                }

                if (a[nr][nc] == 1 && visited[nr][nc] == 0) {
                    q.addLast(new int[] {nr, nc});
                    visited[nr][nc] = visited[r][c] + 1;
                }
            }
        }

        return -1;
    }
}
