import java.util.*;
public class Perfect {
    int num;
    Perfect(int n){
        num=n;
    }
    int sumOfFactors(int i){
        if(i==(num/2))
            return i;
        if(num%i==0)
            return i+sumOfFactors(i+1);
        else
            return sumOfFactors(i+1);
    }
    void check(){
        int sum=sumOfFactors(1);
        if(sum==num)
            System.out.println("Perfect Number!!");
        else    
            System.out.println("Not Perfect Number!!");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numebr to check (n): ");
        int n=sc.nextInt();
        Perfect obj=new Perfect(n);
        obj.check();
        sc.close();
    }
}
