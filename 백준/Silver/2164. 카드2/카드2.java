import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> q = new ArrayDeque<>();

        for (int i = 1; i < n + 1; i++) {
            q.addLast(i);
        }

        while (q.size() > 1) {
            q.removeFirst();
            q.addLast(q.removeFirst());
        }

        System.out.println(q.removeFirst());
    }
}
