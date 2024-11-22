import java.util.*;
public class binaryAdd {
    static long getBin(long x){
        String st="";
        while(x!=0){
            st=Long.toString(x%2)+st;
            x/=2;
        }
        return Long.parseLong(st);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number (m): ");
        long m=sc.nextLong();
        System.out.print("Enter the second number(n): ");
        long n=sc.nextLong();
        long mb=getBin(m);
        long nb=getBin(n);
        long s=getBin(m+n);
        System.out.println("Binary of "+m+ " is: "+mb);
        System.out.println("Binary of "+n+ " is: "+nb);
        System.out.println("Sum of "+mb+ " and "+nb+" is: "+s);
        sc.close();
    }
}