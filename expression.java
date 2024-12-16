import java.util.Scanner;
public class expression {
    String expn;
    expression(){
        expn="";
    }
    void inputexp(String ex){
        expn=ex;
    }
    long getFinalVal(){
        Scanner workOn=new Scanner(expn);
        int left, right;
        char opr;
        left=workOn.nextInt();
        opr=workOn.next().charAt(0);
        right=workOn.nextInt();
        workOn.close();
        long res=0;
        if(opr=='+') 
            res=left+right;  
        if(opr=='-') 
            res=left-right;
        if(opr=='*') 
            res=left*right;  
        else if(opr=='/') 
            res=left/right;
        
        return res; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the expression to work with: ");
        String ex=sc.nextLine();
        sc.close();
        expression obj=new expression();
        obj.inputexp(ex);
        System.out.println("The resultant: "+obj.getFinalVal());
    }
}
