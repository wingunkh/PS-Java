import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        int[] a = new int[10001];

        for (int i = 1; i < a.length; i++) {
            a[i] = i;
        }

        for (int i = 1; i < a.length; i++) {
            String s = String.valueOf(i);
            int n = i;

            for (int j = 0; j < s.length(); j++) {
                n += s.charAt(j) - '0';
            }

            if (n <= 10000) {
                a[n] = 0;
            }
        }

        for (int i : a) {
            if (i != 0) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}
