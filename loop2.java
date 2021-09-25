import java.util.Scanner;

public class loop2 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            a = a + (int) Math.pow(2.0, i) * b;
            int d = 0;
            d += a;
            System.out.print("" + d);
            System.out.print(" ");

        }
        System.out.print("\n");

        sc.close();

    }
}
