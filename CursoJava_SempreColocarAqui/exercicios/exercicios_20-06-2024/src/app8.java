import java.util.Locale;
import java.util.Scanner;

public class app8 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 6;
        int one = 0;
        int two = 1;
        int result = 0; // 2

        for (int i = 1; i <= n; i++) {

            result = one + two;
            one = two;
            two = result;
            System.out.println(result);

        }

        sc.close();

    }
}
