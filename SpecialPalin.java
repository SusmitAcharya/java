import java.util.Scanner;
public class SpecialPalin {
    boolean isPalin(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }
    boolean isSpecial(String s){
        if(s.charAt(0)==s.charAt(s.length()-1))
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SpecialPalin obj=new SpecialPalin();
        System.out.print("Enter the string to work upon: ");
        String st=sc.nextLine()+" ";
        int idx=st.indexOf(' ');
        String wd="";
        for(int i=0;i<st.length()-1;i++){
            wd=st.substring(i,idx);
            i=idx;
            idx=st.indexOf(' ', idx+1);
            if(obj.isSpecial(wd)){
                if(obj.isPalin(wd))
                    System.out.println(wd+" is Special and Palindrome!!");
                else
                    System.out.println(wd+" is Only Special!!");
            }
            else
                System.out.println(wd+" is not Special!!");
        }
        sc.close();
    }
}
