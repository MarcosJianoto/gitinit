import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {

        // TABUADA magica...

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}
