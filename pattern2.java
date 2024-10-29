/*
1 1 1
2 2
3
*/
public class pattern2 {
    public static void main(String[] args) {
        int k=1;
        for(int i=3;i>=1;i--){
            for(int j=1;j<=i;j++)
                System.out.print(k+" ");
            System.out.println();
            k++;
        }
    }
}
