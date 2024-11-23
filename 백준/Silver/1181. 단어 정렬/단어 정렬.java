import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            hashSet.add(s);
        }

        List<String> a = new ArrayList<>(hashSet);

        a.sort((o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else {
                return o1.length() - o2.length();
            }
        });

        for (String s : a) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }
}
