import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i < n + 1; i++) {
            String stringNumber = String.valueOf(i);

            if (stringNumber.length() <= 2) {
                result += 1;
                continue;
            }

            if (Math.abs(stringNumber.charAt(0) - '0' - stringNumber.charAt(1) - '0')
                    == Math.abs(stringNumber.charAt(1) - '0' - stringNumber.charAt(2) -'0')) {
                result += 1;
            }
        }

        System.out.println(result);
    }
}
