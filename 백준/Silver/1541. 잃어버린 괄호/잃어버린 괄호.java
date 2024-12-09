import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), "-");
        ArrayList<String> a = new ArrayList<>();
        int result = 0;

        while (st.hasMoreTokens()) {
            a.add(st.nextToken());
        }

        for (int i = 0; i < a.size(); i++) {
            st = new StringTokenizer(a.get(i), "+");
            int tmp = 0;

            while (st.hasMoreTokens()) {
                tmp += Integer.parseInt(st.nextToken());
            }

            if (i == 0) {
                result += tmp;
            } else {
                result -= tmp;
            }
        }

        System.out.println(result);
    }
}
