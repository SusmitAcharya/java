import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter teh string to work upon: ");
        String s=sc.nextLine()+" ";

        int maxLen=0, idx=0;
        String longWrd="";
        for(int i=0;i<s.length();i++){
            String wrd=s.substring(idx, s.indexOf(" ", idx));
            if(wrd.length()>maxLen){
                maxLen=wrd.length();
                longWrd=wrd;    
            }
            idx=s.indexOf(" ", idx)+1;
            i=idx;
        }

        System.out.println("Word with Max Length: "+longWrd);
        System.out.println("Length = "+maxLen);
        sc.close();
    }
}