import java.util.Scanner;

public class Ex2_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        if ( (c>='a'&&c<='z') || (c>='a'&&c<='z') || (c>='0'&&c<='9') ){
           System.out.println("That char is a alphanumberic"); 
        }
        else
        System.out.println("That char is not a alphanumberic");
    
        sc.close();
    }
}
