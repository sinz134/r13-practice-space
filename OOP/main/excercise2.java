import java.util.*;

public class excercise2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullname = sc.nextLine();
        String[] partsName = fullname.split(" ");
        System.out.print(partsName[0] + " " + partsName[partsName.length - 1] + "\n");
        for(int i = 1; i < partsName.length - 1; i++){
            System.out.print(partsName[i] + " ");
        }
    }
}