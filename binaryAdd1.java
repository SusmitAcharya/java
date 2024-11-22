import java.util.*;
public class binaryAdd1 {
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
        int lenMax= (m>n) ? Long.toString(mb).length() : Long.toString(mb).length();
        long s=0;
        for(int i=lenMax-1;i>=0;i--){
            long a;
            try{
                a= Long.parseLong(Long.toString(mb).substring(i,i+1)) + Long.parseLong(Long.toString(nb).substring(i,i+1));
            } catch(Exception e){
                a= Long.parseLong(Long.toString(mb).substring(i)) + Long.parseLong(Long.toString(nb).substring(i));
            }
            if(a>1){
                a=getBin(a);
            }
            s+=a;
        }

        s=getBin(s);
        System.out.println("Binary of "+m+ " is: "+mb);
        System.out.println("Binary of "+n+ " is: "+nb);
        System.out.println("Sum of "+mb+ " and "+nb+" is: "+s);
        sc.close();
    }
}