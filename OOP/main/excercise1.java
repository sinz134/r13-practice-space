import java.util.*;

public class excercise1{
    public static void main(String[] args){
        int n, m;
        int S = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line of matrix: ");
        n = sc.nextInt();
        System.out.println("Enter column of matrix: ");
        m = sc.nextInt();

        int [][] A = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                A[i][j] = sc.nextInt();
            }
        }
    
        System.out.println("Matrix: ");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(A[i][j] + " ");
                if(A[i][j] % 3 == 0){
                    S = S + A[i][j];
                }
            }
            System.out.print("\n");
        }
        System.out.print(S);
    }
}
