import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int target = 2;
        int tmp = 0;

        for (int i = 0; i < n; i++) {
            if (tmp == target - 1) {
                target += 1;
                tmp = 0;
            }

            tmp += 1;
        }

        if (target % 2 != 0) {
            System.out.println(tmp + "/" + (target - tmp));
        } else {
            System.out.println((target - tmp) + "/" + tmp);
        }
    }
}
