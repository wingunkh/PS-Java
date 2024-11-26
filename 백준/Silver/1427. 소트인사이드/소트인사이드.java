import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int n = s.length();
        Integer[] a = new Integer[n];


        for (int i = 0; i < n; i++) {
            a[i] = s.charAt(i) - '0';
        }

        Arrays.sort(a, Collections.reverseOrder());

        for (Integer i : a) {
            sb.append(i);
        }

        System.out.println(sb);
    }
}
