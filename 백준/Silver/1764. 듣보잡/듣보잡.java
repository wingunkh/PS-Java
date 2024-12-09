import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> a = new ArrayList<>();

        for (int i = 0; i < n + m; i++) {
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for (String s : map.keySet()) {
            if (map.get(s) > 1) {
                a.add(s);
            }
        }

        a.sort(null);

        for (String s : a) {
            sb.append(s).append("\n");
        }

        System.out.println(a.size());
        System.out.println(sb);
    }
}
