import java.util.Scanner;
public class matrix {
    int[][] arr;
    int m,n;
    matrix(){
        arr=new int[50][50];
        m=0;
        n=0;
    }
    void getMat(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of rows (m): ");
        m=sc.nextInt();
        System.out.print("Enter the no. of columns (n): ");
        n=sc.nextInt();
        arr=new int[m][n];
        sc.close();

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                arr[i][j]=(int)(Math.pow(i,3)+Math.pow(j,3));
    }
    void show(){
        System.out.println("\nThe Matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
    }
    void calculation(){
        int primeS=0;
        int fullS=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isPrime(arr[i][j]))
                    primeS+=arr[i][j];
                if(i!=0 && i!=(m-1) && j!=0 && j!=(n-1))
                    fullS+=arr[i][j];
            }
        }

        System.out.println("\nSum of prime elements: "+primeS);
        System.out.println("Sum of all elements except bprder elements: "+fullS);
    }
    boolean isPrime(int n){
        if(n==1)
            return true;
        else{
            int c=0;
            for(int i=1;i<=n;i++)
                if(n%i==0)
                    c++;
            if(c==2)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        matrix obj=new matrix();
        obj.getMat();
        obj.show();
        obj.calculation();
    }
}
