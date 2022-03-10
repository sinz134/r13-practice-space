import java.util.Scanner;

public class option12 {
    // static int CheckTriangle(int a, int b, int c) {
    // if (a + b + c == 180) {
    // return 1;
    // } else {
    // return 0;
    // }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("Enter a: ");
        a = sc.nextDouble();
        System.out.print("Enter b: ");
        b = sc.nextDouble();
        System.out.print("Enter c: ");
        c = sc.nextDouble();
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Is Not a Triangle");
        } else {
            if (a + b + c < 180 || a + b + c > 180) {
                System.out.println("Is Not a Triangle");
            }
            if (a + b + c == 180) {
                System.out.println("Is a Triangle");
            }
        }
        sc.close();
    }
}
