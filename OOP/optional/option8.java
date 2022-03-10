import java.util.Scanner;

public class option8 {
    static int Check(double a, double b) {
        if (a > b) {
            return 0;
        } else if (b > a) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.print("Enter a: ");
        a = sc.nextDouble();
        System.out.print("Enter b: ");
        b = sc.nextDouble();
        if (Check(a, b) == 0) {
            System.out.println("Maximum is a");
        } else if (Check(a, b) == 1) {
            System.out.println("Maximum is b");
        } else {
            System.out.println("a b Equal");
        }
        sc.close();
    }
}
