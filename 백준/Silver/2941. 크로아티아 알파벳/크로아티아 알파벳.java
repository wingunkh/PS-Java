import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] a = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String i : a) {
            s = s.replace(i, "X");
        }

        System.out.println(s.length());
    }
}
