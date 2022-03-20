import java.util.Scanner;

public class ExTwelve {
    public static boolean checkTriangle(int a, int b, int c) {
        return (a > 0 && b > 0 && c > 0)
                && (a + b + c == 180);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (checkTriangle(a, b, c) == true) {
            System.out.print("a, b, c tao thanh hinh tam giac hop le");
        } else {
            System.out.print("a, b,c khong tao thanh hinh tam giac hop le");
        }
    }
}