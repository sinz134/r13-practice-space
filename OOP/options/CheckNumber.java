import java.util.*;

public class CheckNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value you want to check: ");
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println("The value is even number");
        }else{
            System.out.println("The value is odd number");
        }
    }
}
