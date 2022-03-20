import java.util.*;

public class ExSeven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year you want to check: ");
        int year = sc.nextInt();
        if(isValidYear(year)){
            System.out.println("This year is leap year");
        }else{
            System.out.println("This year is not leap year");
        }
    }

    public static boolean isValidYear(int year){
        if(year%4 == 0 && year%100 != 0){
            return true;
        }
        return false;
    }
}
