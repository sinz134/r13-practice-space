import java.util.*;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature (Celcius): ");
        double c = sc.nextDouble();
        System.out.printf("%f Celcius = %f Fahrenheit", c, c*(double)(9.0/5)+32);
    }
}
