import java.util.*;
public class BinarySearch {
    int l, u, m;
    BinarySearch(int n){
        l=0;
        u=n-1;
        m=n/2;
    }
    boolean isPresent(int[] arr, int k, int n){
        if(l==u){
            if(arr[m]==k)    
                return true;
        }
        else if(arr[m]>k){
            u=m-1;
            m=(l+u)/2;
        }
        else if(arr[m]<k){
            l=m+1;
            m=(l+u)/2;
        }

        if(isPresent(arr, k, n))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array (n): ");
        int n=sc.nextInt();
        BinarySearch obj=new BinarySearch(n);
        int[] arr=new int[n];
        System.out.print("Enter "+n+" terms into the array one by one: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.print("Enter the term to search in the array: ");
        int k=sc.nextInt();

        boolean present=obj.isPresent(arr, k, n);
        if(present)
            System.out.println("PRESENT!!");
        else
            System.out.println("NOT PRESENT!!");
        
        sc.close();
    }
}
