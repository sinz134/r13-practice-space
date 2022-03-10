import java.util.Scanner;

public class ExEleven {
    public static boolean checkkitu(char c1){
        boolean n;
        if ((c1>=65 && c1<=90) || (c1>=97 && c1<=122) || (c1>=48 && c1<=57)){
            n = true;
        }
        else{
            n = false;
        }
        return n;
    }
    public static void main(String[] args){
        Scanner c=new Scanner(System.in);
        System.out.println("Nhap ki tu: ");
        char c1=c.next().charAt(0);
        checkkitu(c1);
        if (checkkitu(c1)){
            System.out.println("Day la 1 ki tu alphanumeric");
        }
        else{
            System.out.println("Day khong la 1 ki tu alphanumeric");
        }
    }
}