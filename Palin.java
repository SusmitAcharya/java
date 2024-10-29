import java.util.*;
public class Palin {
    int num;
    int revNum;
    Palin(){
        num=0;
        revNum=0;
    }
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        num=sc.nextInt();
        sc.close();
    }
    int reverse(int y){
        while(y!=0){
            revNum=(revNum*10)+(y%10);
            y/=10;
        }
        System.out.println(revNum);
        return revNum;
    }
    void check(){
        if(num==reverse(num)){
            System.out.println("Palindrome!!");
        }
        else{
            System.out.println("Not Palindrome!!");
        }
    }
    public static void main(String[] args) {
        Palin obj=new Palin();
        obj.accept();
        obj.check();
    }
}