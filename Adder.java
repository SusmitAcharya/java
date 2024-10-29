import java.util.Scanner;
public class Adder {
    String time;
    int[] a=new int[2];
    String added;

    Adder(){
        a[0]=0;
        a[1]=0;
        added="";
        time="";
    }

    void readTime(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the time: ");
        time=sc.nextLine();

        a[0]=Integer.parseInt(time.substring(0,time.indexOf(' ')));
        a[1]=Integer.parseInt(time.substring(time.indexOf(' ', time.indexOf(' ')+1) + 1, time.lastIndexOf(' ')));
    }

    void addTime(Adder X, Adder Y){
        int sumHrs=X.a[0]+Y.a[0];
        int sumMins=X.a[1]+Y.a[1];
        while(sumMins>=60){
            sumHrs++;
            sumMins-=60;
        }
        added+=Integer.toString(sumHrs)+" hours "+Integer.toString(sumMins)+" minutes";
    }

    void dispTime(){
        System.out.println("The added Time: "+added);
    }
    public static void main(String[] args) {
        Adder X=new Adder();
        Adder Y=new Adder();
        Adder obj=new Adder();
        X.readTime();
        Y.readTime();
        obj.addTime(X,Y);
        obj.dispTime();
    }
}
