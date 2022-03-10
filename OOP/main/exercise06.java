import java.util.Scanner;

public class exercise06 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = (arr[i] < min) ? arr[i] : min;
        }
        System.out.print(min);
    }
}
