import java.util.Scanner;

public class KaprekarNumber {
    boolean findKaprekar(int n){
        int d=Integer.toString(n).length();
        int nSq=n*n;

        int h1, h2;
        int l=Integer.toString(nSq).length();

        if(l>d){
            if(l%2==0){
                h1=Integer.parseInt(Integer.toString(nSq).substring(0,d));
                h2=Integer.parseInt(Integer.toString(nSq).substring(d));
            }
            else{
                h1=Integer.parseInt(Integer.toString(nSq).substring(0,d-1));
                h2=Integer.parseInt(Integer.toString(nSq).substring(d-1));
            }

            int s=h1+h2;

            if(s==n)
                return true;
        }
        else{
            if(nSq==n)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        KaprekarNumber obj=new KaprekarNumber();

        int c=0;

        System.out.println("Kaprekar Numbers between 1 and 1000: ");
        for(int i=1;i<=1000;i++){
            if(obj.findKaprekar(i)){
                System.out.print(i+" , ");
                c++;
            }
        }

        System.out.println("\nFrequency of Kaprekar Numbers between 1 and 1000: "+c);

        sc.close();
    }
}
