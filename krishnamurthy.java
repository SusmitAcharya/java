import java.util.Scanner;
public class krishnamurthy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int num=sc.nextInt();

        int cn=num, s=0, f, d;
        while(cn>0){
            f=1;
            d=cn%10;
            for(int i=1;i<=d;i++){
                f=f*i;
            }
            s+=f;
            cn=cn/10;
        }

        if(s==num)
            System.out.println("Krishnamurthy Number!");
        else
            System.out.println("Not Krishnamurthy Number!");
        sc.close();
    }
}
