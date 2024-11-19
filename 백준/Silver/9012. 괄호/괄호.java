import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            ArrayDeque<Character> stack = new ArrayDeque<>();

            for (char c : s.toCharArray()) {
                if (c == '(') {
                    stack.addFirst(c);
                } else if (c == ')') {
                    if (stack.isEmpty()) {
                        stack.addFirst(c);
                        break;
                    } else {
                        stack.removeFirst();
                    }
                }
            }

            if (stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
