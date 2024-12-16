import java.util.Scanner;
public class PseudoArithemetic {
    int n, sum, r;
    int[] ar;
    boolean ans;
    PseudoArithemetic(){
        n=0;
        ar=new int[n];
        sum=0;
        r=0;
        ans=false;
    }
    void accept(int nn){
        n=nn;
        if(n%2==0)
            ar=new int[n];
        else
            ar=new int[n+1];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the sequence: ");
        for(int i=0;i<n;i++)
            if(n%2!=0 && i==n)
                ar[i]=ar[i-1];
            else
                ar[i]=sc.nextInt();
    }
    boolean check(){
        r=ar[0]+ar[ar.length-1];
        for(int i=1;i<ar.length/2;i++){
            if((ar[i]+ar[ar.length-1-i]) != r)
                return false;
        }
        sum=(ar.length/2) * r;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the sequence to work with: ");
        int nn=sc.nextInt();

        PseudoArithemetic obj=new PseudoArithemetic();
        obj.accept(nn);
        if(obj.check()){
            System.out.println("The sequence is Pseudo-Arithemetic!!");
            System.out.println("Sum of the sequence: "+obj.sum);
        }
        else   
            System.out.println("The sequence is not Pseudo-Arithemetic!!");
        sc.close();
    }
}
