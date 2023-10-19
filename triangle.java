import java.util.Scanner;

public class triangle {
    public static void checktriangle(int h,int l,int b){
        if(h==l &&l==b){
            System.out.println("Tringle is equilateral");
        }
        else if (h==l || l==b || b==h)
        {
            System.out.println("tringle is isoceles");

        }
        else
        System.out.println("tringle is scalene");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side ");
        int h = sc.nextInt();
        int b = sc.nextInt();
        int l = sc.nextInt();
        checktriangle(h, l, b);

    }
    
}
