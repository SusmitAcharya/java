import java.util.*;
public class disarium {
    int n, l;
    disarium(int nm){
        n=nm;
        l=0;
    }
    void countDigit(){
        int cn=n;
        while(cn!=0){
            l++;
            cn/=10;
        }
    }
    int sumOfDigits(int i, int p){
        if(i==0)
            return 0;
        return (int)Math.pow((i%10), p)+sumOfDigits(i/10, p-1);
    }
    void check(){
        countDigit();
        int sum=sumOfDigits(n, l);
        if(sum==n)
            System.out.println("DISARIUM NUMBER!!");
        else
            System.out.println("NOT DISARIUM NUMBER!!");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check for (n): ");
        int n=sc.nextInt();
        disarium obj=new disarium(n);
        obj.check();
        sc.close();
    }
}
