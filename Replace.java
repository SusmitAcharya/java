import java.util.Scanner;
public class Replace {
    String str, subStr;
    Replace(String s){
        str=s;
        subStr="";
    }
    void display(){
        System.out.println("The entered value into the string: "+str);
    }
    void getWord(String ss){
        subStr=ss;
    }
    int find_frequency(){
        int fq=0;
        int idx=subStr.length();
        for(int i=0;i<str.length()-subStr.length();i++){
            if(str.substring(i,idx).equalsIgnoreCase(subStr))
                fq++;
            idx++;
        }
        return fq;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence to work upon: ");
        String str=sc.nextLine();
        Replace obj=new Replace(str);
        obj.display();
        System.out.print("Enter the substring to work with: ");
        String subStr=sc.next();
        obj.getWord(subStr);
        System.out.println("The frequency of the entered substring: "+obj.find_frequency());
        sc.close();
    }
}
