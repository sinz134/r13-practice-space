import java.util.*;

public class ExFour {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter days you want to convert: ");
        int days =  sc.nextInt();
        convert(days);
    }

    public static void convert(int days){
        int saveDays = days;
        // convert year
        int years = days/365;
        days = days - years*365;
        // convert month
        int months = days/30;
        days = days - months*30;
        System.out.printf("%d days are convert to %d days %d months and %d years", saveDays, days, months, years);
    }
}
