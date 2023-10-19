import java.util.Scanner;

/**
 * two sum
 */
public class twosum{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = {2,7,11,15};
    int x =-1;
    int y =-1;
    int target =sc.nextInt();



    for(int i=0;i<a.length;i++){
      for(int j=0; j<a.length; j++){
        if(a[i] + a[j]==target){
          x= i;
          y= j;

        }
      }
    }

    System.out.println(x);
    System.out.println(y);
    sc.close();



  }
}
