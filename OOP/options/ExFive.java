import java.util.Scanner;

public class ExFive {
    public static Double doidoc(double cel1){
        double dof;
        dof = (cel1*1.8) + 32;
        return dof;
    }
    public static Double doidof(double fah1){
        double doc;
        doc = (fah1-32)/1.8;
        return doc;
    }
    public static void main(String[] args){
        Scanner cel=new Scanner(System.in);
        System.out.println("Nhap do C: ");
        double cel1=cel.nextDouble();
        doidoc(cel1);
        System.out.println("Chuyen do C sang do F: " + doidoc(cel1));

        Scanner fah=new Scanner(System.in);
        System.out.println("Nhap do F: ");
        double fah1=fah.nextDouble();
        doidof(fah1);
        System.out.println("Chuyen do F sang do C: " + doidof(fah1));
    }
}
