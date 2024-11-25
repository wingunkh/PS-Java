import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());

            if (number == 0) {
                stack.removeFirst();
            } else {
                stack.addFirst(number);
            }
        }

        while (!stack.isEmpty()) {
            result += stack.removeFirst();
        }

        System.out.println(result);
    }
}
