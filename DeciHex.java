import java.util.*;
public class DeciHex {
    int num;
    String hexa;

    DeciHex() {
        num=0;
        hexa="";
    }

    void getNum(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to convert: ");
        num=sc.nextInt();
        sc.close();
    }

    void convert(int n){
        if(n==0)
            return;

        if(n%16>=10)
            hexa=(char)(70-(15-n%16))+hexa;
        else
            hexa=n%16+hexa;
        
        convert(n/16);
    }

    void display(){
        System.out.println("Hexadecimal Equivalent of the number: "+hexa);
    }

    public static void main(String[] args) {
        DeciHex obj=new DeciHex();
        obj.getNum();
        obj.convert(obj.num);
        obj.display();
    }
}
