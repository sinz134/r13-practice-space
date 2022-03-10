import java.util.Scanner;

public class option9 {
    static double Check(double a, double b, double c) {
        if ((a > b && b > c) || (a > c && c > b)) {
            return a;
        } else if ((b > a && a > c) || (b > c && c > a)) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("Enter a: ");
        a = sc.nextDouble();
        System.out.print("Enter b: ");
        b = sc.nextDouble();
        System.out.print("Enter c: ");
        c = sc.nextDouble();
        System.out.println("Maximum is: " + Check(a, b, c));
        sc.close();
    }
}
