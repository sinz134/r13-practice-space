import java.util.Scanner;

public class option10 {
    static int Check(double n) {
        if (n % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        System.out.print("Enter n: ");
        n = sc.nextInt();
        if (Check(n) == 1) {
            System.out.println("n is even number");
        } else {
            System.out.println("n is odd number");
        }
        sc.close();
    }
}
