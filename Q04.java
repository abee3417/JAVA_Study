import java.util.Scanner;
public class Q04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 3 Integers >> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a + b > c)&&(b + c > a)&&(a + c > b)){
            System.out.println("Yes!");
        }
        else{
            System.out.println("No!");
        }
        sc.close();
    }
}