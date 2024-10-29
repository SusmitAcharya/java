import java.util.Scanner;

public class myarray {
    int[] arr;
    int n;

    myarray(int l){
        n=l;
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=0;
        }
    }

    void readarray(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the "+n+" elements of teh array: ");
        for(int i=0; i<n;i++)
            arr[i]=sc.nextInt();
    }

    void bubsort(){
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
    }

    void disparray(){
        System.out.print("The sorted array: ");
        for(int i=0; i<n;i++)
            System.out.print(arr[i]+" , ");
    }

    int binarysearch(int value){
        int m=n/2, lc=0, uc=n;
        while(m>0){
            m=(lc+uc) / 2;
            if(value < arr[m]){
                uc=m-1;
            }
            else if(value > arr[m]){
                lc=m+1;
            }
            else{
                return m;
            }
        }

        return -999;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of elemnts in the array: ");
        int n=sc.nextInt();
        myarray obj=new myarray(n);
        obj.readarray();
        obj.bubsort();
        obj.disparray();

        System.out.print("\nEnter the value to search in the array: ");
        int value=sc.nextInt();
        int idx=obj.binarysearch(value);

        if(idx!=-999)
            System.out.println("Element found!!");
        else
            System.out.println("Element not found!!");
        
        sc.close();
    }
}
