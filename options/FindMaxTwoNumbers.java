import java.util.*;

public class FindMaxTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int a = sc.nextInt();
        System.out.print("Enter second value: ");
        int b = sc.nextInt();

        int max = a;
        if(max < b){
            max = b;
        }
        System.out.println("Max: " + max);
    }
}
