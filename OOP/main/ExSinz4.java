import java.util.Scanner;

public class ExSinz4 {
    public static void main(String[] args){
        Scanner so1=new Scanner(System.in);
        System.out.printf("Nhap so m: ");
        double m=so1.nextDouble();
        Scanner so2=new Scanner(System.in);
        System.out.printf("Nhap so n: ");
        double n=so2.nextDouble();
        double a=m+n;
        System.out.println(a);
        double b=m-n;
        System.out.println(b);
        double c=m*n;
        System.out.println(c);
        double d=m/n;
        System.out.printf("%.3f", d);
    }
}
