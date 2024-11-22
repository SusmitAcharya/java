import java.util.Scanner;
public class bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount to work on (in ₹): ");
        int rs=sc.nextInt();
        int crs=rs;
        if(rs>=1_00_000){ 
            System.out.println("INVALID AMOUNT TO WORK ON!!");
        } else{
            int[] notes={1000, 500, 100, 50, 20, 10, 5, 2, 1};
            int[] deno=new int[notes.length];
            String[] numbers={"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
            String rsInWords="";
            int totalNotes=0;
            while(rs!=0){
                rsInWords=numbers[rs%10-1]+" "+rsInWords;
                rs/=10;
            }
            rs=crs;
            for(int i=0;i<notes.length;i++){
                deno[i]=rs/notes[i];
                rs=rs%notes[i];
                totalNotes+=deno[i];
            }
            System.out.println("In Words: "+rsInWords);
            System.out.println("Denominations: ");
            for(int i=0;i<notes.length;i++){
                if(deno[i]!=0){
                    System.out.println(notes[i]+" x "+deno[i]+ " = " +(notes[i]*deno[i]));
                }
            }
            System.out.println("Total No. of Notes: "+totalNotes);
        }
        sc.close();
    }
}