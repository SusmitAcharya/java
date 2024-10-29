import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String to check for palindrome: ");
        String s=sc.nextLine();
        int l=s.length();
        boolean isPalin=true;

        for(int i=0;i<l/2;i++){
            if(s.charAt(i)!=s.charAt(l-1-i)){ //malayalam
                System.out.println(s.charAt(i)+"  "+s.charAt(l-1-i));
                isPalin=false;
                break;
            }
        }

        if(isPalin)
            System.out.println("Palindrome!!");
        else
            System.out.println("Not Palindorme!!");

        sc.close();
    }
}
