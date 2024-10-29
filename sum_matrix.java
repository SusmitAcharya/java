import java.util.Scanner;

public class sum_matrix {
    int[][] mat=new int[50][50];
    int m,n;

    sum_matrix(){
        for(int i=0;i<50;i++){
            for(int j=0;j<50;j++){
                mat[i][j]=0;
            }
        }
    }

    void read_row_column(int x, int y){
        if(x<50)
            m=x;
        
        if(y<50)
            n=y;
    }

    void readmatrix(){
        mat=new int[m+1][n+1];

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
    }

    void show_mat(){
        System.out.println("The matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    void summatrix(){
        int rs, cs;
        for(int i=0; i<m;i++){
            rs=0;
            cs=0;

            for(int j=0;j<n;j++){
                rs+=mat[i][j];
            }

            for(int j=0, r=0;j<n && r<i;j++ , r++){
                cs+=mat[r][j];
            }
            
            mat[i][n]=rs;
            mat[m][i]=cs;
        }

        System.out.println("The summed matrix: ");
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sum_matrix obj=new sum_matrix();

        System.out.print("Enter the number of rows of the array: ");
        int r=sc.nextInt();
        System.out.print("Enter the number of columns of the array: ");
        int c=sc.nextInt();

        obj.read_row_column(r,c);
        obj.readmatrix();
        obj.show_mat();
        obj.summatrix();
        
        sc.close();
    }
}
