import java.util.Scanner;
public class IconEx
{
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		String str= sc.nextLine();
		
		System.out.println("Upper case string: "+ str.toUpperCase());
		
		
		
		System.out.println("Please enter 10 value for the array: ");
		int[] array=new int[10];
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		
		int temp=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(temp>array[i])
			{
				temp=array[i];
			}
			
		}
		System.out.println("Minimum value: "+temp);
		//  ------OPTIONAL------
	
		
		System.out.println("Name: Nguyen Lam Duy");
		System.out.println("DOB: 01/10/2003");
		System.out.println("Mobile number: 0913569692");
		
		
		
		System.out.print("Please enter 1st number: ");
		int a=sc.nextInt();
		System.out.print("Please enter 2nd number: ");
		int b=sc.nextInt();
		
		System.out.println("Addition: "+(a+b));
		System.out.println("Subtraction: "+(a-b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Division: "+(a/b));	
		System.out.println("Remainder: "+(a%b));	
		
		
		System.out.print("Please enter height: ");
		double height=sc.nextDouble();
		System.out.print("Please enter width: ");
		double width=sc.nextDouble();
		
		double perimeter=(height+width)*2;
		double area=height*width;
		System.out.println("Rectangle's perimeter: "+perimeter);
		System.out.println("Rectangle's area: "+area);
	}
	
	
	
}