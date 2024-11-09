import java.util.Scanner;
public class DDSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numebr of rows (m): ");
        int m=sc.nextInt();
        System.out.print("Enter the number of columns (n): ");
        int n=sc.nextInt();

        int[][] mat=new int[m][n];
        System.out.println("Enter "+(m*n)+" elements into the matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        System.out.println("\nOriginal Array: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }

        int[] row=new int[n];
        for(int i=0;i<m;i++){
            row=mat[i];

            //Insertion Sort:
            for(int j=1;j<n;j++){
                int key=row[j];
                int k=j-1;

                while(k>=0 && row[k]>key){
                    row[k+1]=row[k];
                    k-=1;
                }
                row[k+1]=key;
            }
        }

        System.out.println("Sorted Array: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}