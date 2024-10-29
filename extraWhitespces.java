import java.util.Scanner;

public class extraWhitespces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to check: ");
        String s=sc.nextLine();

        int c=s.substring(0,s.indexOf(' ')+1).length() + s.substring(s.lastIndexOf(' ')).length();
        s=s.substring(s.indexOf(' ')+1, s.lastIndexOf(' '));

        int n=0;
        boolean whiteCount=false;
        for(int i=0; i<s.length()-1;i++){
            if(whiteCount)
                n++;

            if(s.charAt(i+1)==' '){
                whiteCount=true;
            }
            else{
                if(n>1){
                    c++;
                    n=0;
                }
                whiteCount=false;
            }
        }

        System.out.println("No. of extra whitespaces: "+c);
        sc.close();
    }
}
