import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> d = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push_front")) {
                d.addFirst(Integer.valueOf(st.nextToken()));
            } else if (command.equals("push_back")) {
                d.addLast(Integer.valueOf(st.nextToken()));
            } else if (command.equals("pop_front")) {
                if (!d.isEmpty()) {
                    sb.append(d.removeFirst()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else if (command.equals("pop_back")) {
                if (!d.isEmpty()) {
                    sb.append(d.removeLast()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else if (command.equals("size")) {
                sb.append(d.size()).append("\n");
            } else if (command.equals("empty")) {
                if (d.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (command.equals("front")) {
                if (!d.isEmpty()) {
                    sb.append(d.peekFirst()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else if (command.equals("back")) {
                if (!d.isEmpty()) {
                    sb.append(d.peekLast()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
