import java.util.Scanner;
public class Q07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double cent_x, cent_y, r, x, y;
        System.out.print("Input center point & radius >> ");
        cent_x = sc.nextDouble();
        cent_y = sc.nextDouble();
        r = sc.nextDouble();
        System.out.print("Input point >> ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        if(Math.sqrt(Math.pow(x-cent_x, 2) + Math.pow(y-cent_y, 2)) <= r){
            System.out.println("Point (" + x + ", " + y + ") is in the circle.");
        }
        else{
            System.out.println("Point (" + x + ", " + y + ") is not in the circle.");
        }
        sc.close();
    }
}
