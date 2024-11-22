import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Integer[] a = new Integer[n];
        int result = 0;

        for (int i = 0; i < n; i++) {
            int money = Integer.parseInt(br.readLine());
            a[i] = money;
        }

        Arrays.sort(a, Collections.reverseOrder());

        for (Integer i : a) {
            if (k >= i) {
                result += k / i;
                k = k % i;
            }
        }

        System.out.println(result);
    }
}
