import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String s = br.readLine();
            ArrayDeque<String> stack = new ArrayDeque<>();
            String result = "yes";

            if (s.equals(".")) {
                break;
            }

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '(' || c == '[') {
                    stack.addFirst(String.valueOf(c));
                } else if (c == ')') {
                    if (!(!stack.isEmpty() && stack.removeFirst().equals("("))) {
                        result = "no";
                        break;
                    }
                } else if (c == ']') {
                    if (!(!stack.isEmpty() && stack.removeFirst().equals("["))) {
                        result = "no";
                        break;
                    }
                }
            }

            if (!stack.isEmpty()) {
                result = "no";
            }

            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }
}
