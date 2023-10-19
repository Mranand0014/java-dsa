import java.util.Scanner;

public class Simpleinstrest {
    public static void instrest(int p, int r,int t){
        int amt ;
        amt = (p*r*t)/100;
        System.out.println("Your total insterest is "+amt);
        int total = p+amt;
        System.out.println("total amont "+total);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount instrest rate and time");
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        instrest(p, r, t);

    }

    
}
