import java.util.*;

public class FinMaxThreeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int a = sc.nextInt();
        System.out.print("Enter second value: ");
        int b = sc.nextInt();
        System.out.print("Enter third value: ");
        int c = sc.nextInt();

        int max = a;
        if(max < b){
            max = b;
        }
        if(max < c){
            max = c;
        }
        System.out.println("Max: " + max);
    }
}
