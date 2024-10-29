import java.util.Scanner;
public class functionOverloading {
    float area(float r){
        return (3.14f*r*r);
    }

    float area(int s){
        return (s*s);
    }

    float area(int l, int b){
        return (l*b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        functionOverloading obj=new functionOverloading();

        System.out.println("Enter the radius of the circle: ");
        float r=sc.nextFloat();
        System.out.println("Enter the side of the square: ");
        int s=sc.nextInt();
        System.out.println("Enter the length and breadth of the rectangle: ");
        int l=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Area of the circle: "+obj.area(r));
        System.out.println("Area of the square: "+obj.area(s));
        System.out.println("Area of the rectangle: "+obj.area(l,b));

        sc.close();
    }
}