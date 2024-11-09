import java.util.Scanner;
public class VertBanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of teams (n): ");
        int n=sc.nextInt();
        sc.nextLine();

        String[] teams=new String[n];
        int maxLen=0;
        System.out.println("Enter the names of the "+n+" teams: ");
        for(int i=0;i<n;i++){
            System.out.print("Team "+(i+1)+": ");
            teams[i]=sc.nextLine();
            maxLen=(teams[i].length() > maxLen) ? teams[i].length() : maxLen;
        }

        for(int i=0;i<n;i++){
            for(int j=1; j<=maxLen - teams[i].length(); j++){
                teams[i]+=" ";
            }
        }

        char[][] ban=new char[maxLen][n];
        for(int i=0;i<maxLen;i++){
            for(int j=0;j<n;j++){
                try{
                    ban[i][j]=teams[j].charAt(i);
                }
                catch(Exception e){}
            }
        }

        System.out.println("The Vertical Banner: ");
        for(int i=0;i<maxLen;i++){
            for(int j=0;j<n;j++)
                System.out.print(ban[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
}
