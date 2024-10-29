import java.util.Scanner; 
public class factorialRec {
    int factorial(int n){
        if(n==0)
            return 1;

        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        factorialRec obj=new factorialRec();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to find factorial of: ");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" = "+obj.factorial(n));
        sc.close();
    }
}
