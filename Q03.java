import java.util.Scanner;
public class Q03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 3 integers >> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((b < a && a < c)||(c < a && a < b)){
            System.out.println("Middle number is " + a);
        }
        else if((a < b && b < c)||(c < b && b < a)){
            System.out.println("Middle number is " + b);
        }
        else if((a < c && c < b)||(b < c && c < a)){
            System.out.println("Middle number is " + c);
        }    
        sc.close();
    }
}