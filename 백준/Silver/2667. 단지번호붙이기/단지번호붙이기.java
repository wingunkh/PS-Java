import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int[][] a;
    static boolean[][] visited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        a = new int[n][n];
        visited = new boolean[n][n];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            for (int j = 0; j < n; j++) {
                a[i][j] = s.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1 && !visited[i][j]) {
                    result.add(bfs(i, j));
                }
            }
        }

        result.sort(Comparator.naturalOrder());
        sb.append(result.size()).append("\n");

        for (Integer i : result) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);
    }

    public static int bfs(int x, int y) {
        ArrayDeque<int[]> q = new ArrayDeque<>();
        int count = 0;

        q.addLast(new int[] {x, y});
        visited[x][y] = true;
        count += 1;

        while (!q.isEmpty()) {
            int[] now = q.removeFirst();
            int r = now[0];
            int c = now[1];

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (!(0 <= nr && nr < n && 0 <= nc && nc < n)) {
                    continue;
                }

                if (a[nr][nc] == 1 && !visited[nr][nc]) {
                    q.addLast(new int[]{nr, nc});
                    visited[nr][nc] = true;
                    count += 1;
                }
            }
        }

        return count;
    }
}
