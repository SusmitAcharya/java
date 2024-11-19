import java.util.Scanner;
public class ValidMail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the mail id to check: ");
        String mail=sc.nextLine();
        boolean isValid=true;

        if(mail.indexOf('@')==-1)
            isValid=false;
        if(mail.indexOf(' ')!=-1)
            isValid=false;
        if(mail.substring(mail.length()-4).equals(".com") == false)
            isValid=false;
        if(isValid)
            System.out.println("Valid Mail id!!");
        else
            System.out.println("Invalid Mial id!!");
        sc.close();
    }
}