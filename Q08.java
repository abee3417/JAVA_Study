import java.util.Scanner;
public class Q08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double cent_x1, cent_y1, r1;
        double cent_x2, cent_y2, r2;
        System.out.print("Input center and radius of 1st circle >> ");
        cent_x1 = sc.nextDouble();
        cent_y1 = sc.nextDouble();
        r1 = sc.nextDouble();
        System.out.print("Input center and radius of 2nd circle >> ");
        cent_x2 = sc.nextDouble();
        cent_y2 = sc.nextDouble();
        r2 = sc.nextDouble();
        if (r1 + r2 > Math.sqrt(Math.pow(cent_x2-cent_x1, 2) + Math.pow(cent_y2-cent_y1, 2))){
            System.out.println("Two circles are overlapped");
        }
        else{
            System.out.println("Two circles are not overlapped");
        }
        sc.close();
    }
}
