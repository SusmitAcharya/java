/*
1 
1 3 
1 3 5 
1 3 5 7 
1 3 5 7 9 
 */
public class pattern1 {
   public static void main(String[] args) {
        for(int i=1;i<=9;i+=2){
            for(int j=1;j<=i;j+=2)
                System.out.print(j+" ");
            System.out.println();
        }
   } 
}
