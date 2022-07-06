import java.util.Scanner;
public class Q06 {
    public static void main(String[] args){
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input (x, y) >> ");
        x = sc.nextInt();
        y = sc.nextInt();
        if (100 <= x && x <= 200 && 100 <= y && y <= 200){
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle.");
        }
        else{
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle.");
        }
        sc.close();
    }
}
