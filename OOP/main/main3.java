import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("");
        n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            // System.out.println(count);
            if (count == 1) {
                System.out.print(i + "\t");
            }
        }
        sc.close();
    }
}
