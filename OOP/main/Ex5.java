import java.util.Scanner;

public class Ex5 {
    public static char inhoa(char n){
        char a=n;
        if(n>='a' && n<='z'){
            a-=32;
        }
        return a;
    }
    public static void main(String[] args){
        System.out.printf("Nhap chuoi: ");
        Scanner chuoi=new Scanner(System.in);
        String ckt;
        ckt=chuoi.nextLine();
        for(int i=0; i<ckt.length(); i++){
            System.out.printf("%c", inhoa(ckt.charAt(i)));
        }
    }
}
