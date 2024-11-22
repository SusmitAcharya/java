import java.util.Scanner;
public class Decoder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coded message: ");
        StringBuffer code=new StringBuffer(sc.nextLine());
        String revCode=new String(code.reverse());
        String AsciiSub="";
        String message="";
        for(int i=0;i<revCode.length();i++){
            AsciiSub+=revCode.charAt(i);
            int asc=Integer.parseInt(AsciiSub);
            if((asc>=65 && asc<=90) || (asc==32) || (asc>=97 && asc<=122)){
                message+=(char)asc;
                AsciiSub="";
            }
        }
        System.out.println("Decoded Message: "+message);
        sc.close();
    }
}
