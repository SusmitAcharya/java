import java.util.Scanner;
public class casperCipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence to encrypt: ");
        String st=sc.nextLine();
        if(!(st.length()<3 || st.length()>100)){
            String cipher="";
            for(char c : st.toCharArray()){
                if(Character.isLetter(c)){
                    int toAdd = (int)c + 13;
                    if(toAdd > 90  && toAdd < 110)
                        cipher+=(char)(64 + (toAdd - 90));
                    else if(toAdd > 120)
                        cipher+=(char)(96 + (toAdd - 122));
                    else
                        cipher+=(char)toAdd;
                }
                else
                    cipher+=c;
            }

            System.out.println("Casper Cipher encrypted word: "+cipher);
        } else {
            System.out.println("Invalid Length!!");
        }
        sc.close();
    }
}
