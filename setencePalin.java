import java.util.Scanner;

public class setencePalin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence to extract palindrome words: ");
        String s=sc.nextLine()+" ";

        int l;
        String word="", res="";
        boolean isPalin;

        for(int i=0;i<s.length();i++){
            word=s.substring(i, s.indexOf(' ',  i));
            i=s.indexOf(' ',  i);
            isPalin=true;
            l=word.length();

            inner:
            for(int j=0;j<l/2;j++){
                if(word.charAt(j)!=word.charAt(l-1-j)){
                    isPalin=false;
                    break inner;
                }
            }

            res+=(isPalin)?(word+" "):"";
        }

        System.err.println("Palindrome word of the string: "+res);
        sc.close();
    }
}
