import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        while (n > 0) {
            if (n % 5 == 0) {
                result += n / 5;
                break;
            } else if (n >= 3) {
                result += 1;
                n -= 3;
            } else {
                result = -1;
                break;
            }
        }

        System.out.println(result);
    }
}
