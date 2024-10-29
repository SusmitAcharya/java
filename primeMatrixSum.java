import java.util.Scanner;
public class primeMatrixSum {
    boolean isPrime(int n){
        int d=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) 
                d++;
        }

        if(d==2)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        primeMatrixSum obj=new primeMatrixSum();

        int[][] mat=new int[3][3];

        System.out.println("Enter the elements into the 3x3 matrix: ");
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                mat[i][j]=sc.nextInt();
        
        System.out.println("The entered matrix: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }

        int s=0;
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                s+=(obj.isPrime(mat[i][j])) ? mat[i][j] : 0;

        System.out.println("Sum of prime elements of the array: "+s);

        sc.close();
    }
}
