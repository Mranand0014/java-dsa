import java.util.Scanner;

public class Leapyear {
    public static void Leap(int n){
        if(n%4==0){
            if(n%100!=0){
                System.out.println("leapyear");
            }
            else if (n%400==0){
                System.out.println("leap year");
            }
            else{
                System.out.println("not a leap year");

            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int b = sc.nextInt();
        Leap(b);
    }
    
}
