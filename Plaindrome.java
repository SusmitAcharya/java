import java.util.*;
public class Plaindrome{
    int i=0;
    int reverse(int n){
        if(n==0)
            return i;
        i=(i*10)+(n%10);
        return reverse(n/10);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int n=sc.nextInt();

        Plaindrome obj=new Plaindrome();
        if(obj.reverse(n)==n)
            System.out.println("Palindrome!!");
        else
            System.out.println("Not Palindrome!!");
        sc.close();
    }
}