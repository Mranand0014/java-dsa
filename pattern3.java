import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the size");
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i ;j--){
            System.out.print("*");
            }
            System.out.println();
        }



    }
    
}
