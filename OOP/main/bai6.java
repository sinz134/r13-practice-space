import java.util.Scanner;
public class bai6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        String s = sc.nextLine();
        String split[] = s.split(" ");
        for (int j = 0; j < 10; j++)
            a[j] = Integer.parseInt(split[j]);
        int min = a[0];
        for (int i = 0; i < 10; i++)
        {
            if ( min > a[i])
                min = a[i];
        }
        System.out.println(min);
    }
}