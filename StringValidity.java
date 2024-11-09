import java.util.Scanner;
public class StringValidity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.nextLine();

        boolean isValid=true;
        //Checking Ending character;
        {
            char ch=s.charAt(s.length()-1);
            if(!(ch=='.' || ch== '?' || ch=='!'))
                isValid=false;
        }

        //Checking whitespaces: 
        {
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' '){
                    if(s.charAt(i+1)==' ')
                        isValid=false;
                }
            }
        }

        //Checking UpperCase
        if(!s.equals(s.toUpperCase()))
            isValid=false;

        if(!isValid){
            System.out.println("Invalid String!!");
            System.exit(0);
        }

        String concat="", wrd="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' || i==s.length()-1){
                StringBuffer obj=new StringBuffer(wrd);
                String rev=new String(obj.reverse());

                if(!wrd.equals(rev)){
                    wrd+=rev.substring(1);
                }

                concat+=wrd+" ";
                wrd="";
            }
            else
                wrd+=s.charAt(i);
        }

        System.out.println("\nOriginal String: "+s);
        System.out.println("Concatinated String: "+concat);
        sc.close();
    }
}