import java.util.Scanner;

public class chrArr {
    char[] ch;
    int size;
    chrArr(char[] c){
        ch=c;
        size=ch.length;
    }
    void displayArray(){
        System.out.println("\nThe given array: ");
        for(int i=0;i<size;i++)    
            System.out.print(ch[i]+"\t");
        System.out.println();
    }
    void move(){
        char[] fnl=new char[size];
        int lIdx=0, Uidx=size-1;
        for(int i=0;i<size;i++)    
            if(Character.isUpperCase(ch[i])){
                fnl[Uidx]=ch[i];
                Uidx--;
            }
            else{
                fnl[lIdx]=ch[i];
                lIdx++;
            }
        
        System.out.println("The final changed array:");
        for(int i=0;i<size;i++)    
            System.out.print(fnl[i]+"\t");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array to work with: ");
        int n=sc.nextInt();
        char[] c=new char[n];
        System.out.println("Enter the alphabets into the array: ");
        for(int i=0;i<n;i++)    
            c[i]=sc.next().charAt(0);
        chrArr obj=new chrArr(c);
        obj.displayArray();
        obj.move();
        sc.close();
    }
}
