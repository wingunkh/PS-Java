import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int number = 1;

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());

            while (number <= target) {
                stack.addFirst(number);
                number += 1;
                sb.append("+").append("\n");
            }

            if (!stack.isEmpty() && stack.peekFirst() == target) {
                stack.removeFirst();
                sb.append("-").append("\n");
            } else {
                sb = new StringBuilder("NO");
                break;
            }
        }

        System.out.println(sb);
    }
}
