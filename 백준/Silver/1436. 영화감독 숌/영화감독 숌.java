import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int number = 0;

        while (true) {
            String stringNumber = String.valueOf(number);

            if (stringNumber.contains("666")) {
                count += 1;
            }

            if (count == n) {
                System.out.println(number);
                break;
            }

            number += 1;
        }
    }
}
