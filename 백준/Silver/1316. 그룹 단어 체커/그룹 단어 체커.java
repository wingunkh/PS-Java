import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = n;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            for (int j = 0; j < s.length() - 1; j++) {
                char currentChar = s.charAt(j);
                char nextChar = s.charAt(j + 1);

                if (currentChar != nextChar) {
                    if (s.indexOf(currentChar, j + 1) != -1) {
                        result -= 1;
                        break;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
