import java.util.Scanner;
public class FibonacciRecursion {
    int fibo(int n){
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else
            return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        FibonacciRecursion obj=new FibonacciRecursion();
        System.out.print("Enter the number of terms to print (n): ");
        int n=sc.nextInt();
        String series="";
        for(int i=1;i<=n;i++)
            series+=Integer.toString(obj.fibo(i))+" , ";
        System.out.println("The Fibanacci Series till n terms: "+series);
        sc.close();
    }
}
