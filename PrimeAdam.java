import java.util.Scanner;
public class PrimeAdam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int m=sc.nextInt();
        System.out.print("Enter the upper limit: ");
        int n=sc.nextInt();

        if(m>n){
            System.out.println("Invalid Range!!");
            System.exit(0);
        }


        int f=0; //frequency
        boolean isPrime=false, isAdam=false;

        for(int crr=m;crr<=n;crr++){
            //Check for prime:
            int c=0;
            for(int i=1; i<=crr; i++){
                if(crr%i==0)
                    c++;
            }
;
            if(c==2)
                isPrime=true;
            else
                isPrime=false;

            //Check for Adam: 
            int sq=(int)Math.pow(crr,2);
            StringBuffer crrRev=new StringBuffer(Integer.toString(crr));
            crrRev.reverse();
            int rev=Integer.parseInt(new String(crrRev));
            int revSq=(int)Math.pow(rev, 2);
            StringBuffer revRevSq=new StringBuffer(Integer.toString(revSq));
            revRevSq.reverse();

            String[] sqs=new String[2];
            sqs[0]=Integer.toString(sq);
            sqs[1]=new String(revRevSq);

            if(sqs[0].equals(sqs[1]))
                isAdam=true;
            else
                isAdam=false;

            if(isPrime && isAdam){
                f++;
                System.out.print(crr+" , ");
            }
        }

        System.out.println("\nFrequency: "+f);
        sc.close();
    }
}
