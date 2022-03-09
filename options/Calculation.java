import java.util.*;

public class Calculation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Integer value: ");
        int a = sc.nextInt();
        System.out.print("Enter second Integer value: ");
        int b = sc.nextInt();

        System.out.println("Addition of 2 values: " + (a + b));
        System.out.println("Subtraction of 2 values: " + (a - b));
        System.out.println("Multiplication of 2 values: " + (a * b));
        System.out.println("Divison of 2 values: " + (a / b));
        System.out.println("Remainder of 2 values: " + (a % b));
    }
}
