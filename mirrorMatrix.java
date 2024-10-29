import java.util.Scanner;
public class mirrorMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m=sc.nextInt();
        System.out.println("Enter the number of columns ");
        int n=sc.nextInt();

        int[][] mat=new int[m][n];
        System.out.println("Enter the elements into the matrix of size "+m+"x"+n+" : ");
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                mat[i][j]=sc.nextInt();

        System.out.println("The entered matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }

        int[][] hor=new int[m][n];
        int[][] ver = new int[m][n];

        //Creating the mirros: 
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                hor[i][j]=mat[i][n-1-j];

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                ver[i][j]=mat[m-1-i][j];

        //Printing: 
        System.out.println("The horizontal mirror: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                System.out.print(hor[i][j]+" ");
            System.out.println();
        }

        System.out.println("The vertical mirror: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                System.out.print(ver[i][j]+" ");
            System.out.println();
        }

        sc.close();
    }
}
