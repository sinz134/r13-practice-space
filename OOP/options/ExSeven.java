import java.util.Scanner;

public class ExSeven {
    public static boolean leapyear(int y){
        boolean n;
        if (y%4==0 && y%100 != 0){
            n = true;
        }
        else{
            n = false;
        }
        return n;
    }
    public static void main(String[] args){
        Scanner year=new Scanner(System.in);
        System.out.println("Nhap nam: ");
        int year1=year.nextInt();
        leapyear(year1);
        if (leapyear(year1)){
            System.out.println(year1 + " la nam nhuan");
        }
        else{
            System.out.println(year1 + " khong la nam nhuan");
        }
    }
}