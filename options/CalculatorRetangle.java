import java.util.*;

public class CalculatorRetangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter retangle height: ");
        double a = sc.nextDouble();
        System.out.print("Enter retangle width: ");
        double b = sc.nextDouble();

        System.out.print("The perimeter of retangle: " + (a+b)*2);
        System.out.print("\nThe area of retangle: " + (a*b));
    }
}