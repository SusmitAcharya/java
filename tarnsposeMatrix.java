import java.util.Scanner;

public class tarnsposeMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix: ");
        int m=sc.nextInt();
        System.out.println("Enter the number of columns of the matrix: ");
        int n=sc.nextInt();

        int[][] mat=new int[m][n];
        System.out.println("Enter the elements into the matrix of size "+m+"x"+n+" : ");
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                mat[i][j]=sc.nextInt();

        System.out.println("\nThe entered matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }

        int[][] tran=new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                tran[i][j]=mat[j][i];

        System.out.println("\nThe transpose matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                System.out.print(tran[i][j]+" ");
            System.out.println();
        }

        sc.close();
    }
}
