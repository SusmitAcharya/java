import java.util.Scanner;
public class ArrDD {
    int[][] ar;
    int m,n,x;

    void getRowColumn(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of rows (m): ");
        m=sc.nextInt();
        System.out.print("Enter the no. of columns (n): ");
        n=sc.nextInt();

        ar=new int[m][n];
    }

    void getMatrix(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ar[i][j]=sc.nextInt();
            }
        }
    }

    void print_mat_and_sum(){
        int max, s=0;
        for(int i=0;i<m;i++){
            max=ar[i][0];
            for(int j=1;j<n;j++){
                max=(ar[i][j]>max)?ar[i][j]:max;
            }
            s+=max;
        }
        System.out.println("Sum of largest number of each row: "+s);
    }

    void changeDiagonal(){
        if(m==n){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter value of x: ");
            int x=sc.nextInt();

            //Left Diagonal:
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(i==j)
                        ar[i][j]=x;
                }
            }

            //Right Diagonal:
            for(int i=0;i<m;i++){
                for(int j=n-1;j>=0;j--){
                    if(j==(m-1-i))
                        ar[i][j]=x;
                }
            }

            System.out.println("Enter the elements of the matrix: ");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(ar[i][j]+"\t");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Not a Square Matrix So Cannot Change Diagonal!!");
        }
    }

    public static void main(String[] args) {
        ArrDD obj=new ArrDD();
        obj.getRowColumn();
        obj.getMatrix();
        obj.print_mat_and_sum();
        obj.changeDiagonal();
    }
}
