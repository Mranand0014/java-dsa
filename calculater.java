// import java.net.SocketTimeoutException;
import java.util.Scanner;
// import java.util.Scanner;

public interface calculater {
    public static void main(String[] args) {
        
     
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter base value ");
        int a=Sc.nextInt();
        System.out.print("Enter exponet");
        int b =Sc.nextInt();

        int ans=1;
        for(int i=1;i<=b;i++){
            ans =ans *a;

        }
        System.out.print("Power is: ");
        System.out.print(ans);


        Sc.close();

    }
}
