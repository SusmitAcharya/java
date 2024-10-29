import java.util.Scanner;
public class fibonaccciRec {
    int n;
    void fibo(int a, int b, int i){
        if(i>n)
            return;

        if(i==1)
            System.out.print(0+" ");
        else if(i==2)
            System.out.print(1+" ");
        else
            System.out.print(a+" ");

        fibo(b, a+b, i+1);
        return;
    }
    public static void main(String[] args) {
        fibonaccciRec obj=new fibonaccciRec();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms to print: ");
        obj.n=sc.nextInt();
        System.out.println("Fibonacci till "+obj.n+" terms : ");
        obj.fibo(0, 1, 1);
        sc.close();
    }
}
