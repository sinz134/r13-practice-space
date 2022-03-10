import java.util.Scanner;

public class ExSinz3{
    public static boolean snt1(int n){
        int check=0;
        boolean ck;
        if(n<2){
            ck=false;
        }
        else{
            for(int i=2; i <= n-1; i++){
                if(n%i==0){
                    check++;
                }
            }
            if(check==0){
                ck=true;
            }
            else{
                ck=false;
            }
        }
        return ck;
    }
    public static void main(String[] args){
        Scanner snt=new Scanner(System.in);
        System.out.printf("Nhap gia tri n: ");
        double n=snt.nextDouble();
        for(int j=2; j<=n; j++){
            if(snt1(j)){
                System.out.printf(j + " ");
            }
        }
    }
}