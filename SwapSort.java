import java.util.Scanner;
public class SwapSort {
    String wrd, swapWrd, sortWrd;
    int len;
    SwapSort(){
        wrd="";
        swapWrd="";
        sortWrd="";
    }

    void readWord(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the word to read: ");
        wrd=sc.nextLine().toUpperCase();
        len=wrd.length();
        sc.close();
    }

    void swapChar(){
        char chF=wrd.charAt(0);
        char chL=wrd.charAt(len-1);
        swapWrd+=chL+wrd.substring(1, len-1)+chF;
    }

    void sortWord(){
        char ch;
        for(int i=0;i<len;i++){
            ch=wrd.charAt(i);
            for(int j=i+1;j<len;j++){
                if(wrd.charAt(j)<ch){
                    ch=wrd.charAt(j);
                }
            }

            sortWrd+=ch;
        }
    }

    void display(){
        System.out.println("Word Entered: "+wrd);
        System.out.println("Swaaper Word: "+swapWrd);
        System.out.println("Sorted Word: "+sortWrd);
    }

    public static void main(String[] args) {
        SwapSort obj=new SwapSort();
        obj.readWord();
        obj.swapChar();
        obj.sortWord();
        obj.display();
    }
}
