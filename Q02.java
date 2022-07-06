import java.util.Scanner;
public class Q02{
   public static void main(String[] args){
       int n_10, n_1;
       Scanner sc = new Scanner(System.in);
       System.out.print("Input 2-digit integer(10-99) >> ");
       n_10 = sc.nextInt();
       n_1 = n_10 % 10;
       n_10 /= 10;
       if (n_1 == n_10){
           System.out.println("Yes! The digits of 10 and the digits of 1 are the same.");
       }
       else{
           System.out.println("No! The digits of 10 and the digits of 1 ard different.");
       }
       sc.close();
   }
}