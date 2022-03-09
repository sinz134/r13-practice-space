import java.util.*;

public class excercise2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullname = sc.nextLine();
        String[] partsName = fullname.split(" ");
        for(int i = 0; i < partsName.length; i++){
            String temp = partsName[2];
            partsName[2] = partsName[1];
            partsName[1] = temp;
            if(i == 1){
                System.out.println(partsName[i]);
            }else{
                System.out.print(partsName[i] + " ");
            }
        }
    }
}