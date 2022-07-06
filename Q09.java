import java.util.Scanner;
public class Q09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input month (1~12) >> ");
        int month = sc.nextInt();
        if (month == 1 || month == 2 || month == 12){
            System.out.println("Winter");
        }
        else if (3 <= month && month <= 5){
            System.out.println("Spring");
        }
        else if (6 <= month && month <= 8){
            System.out.println("Summer");
        }
        else if (9 <= month && month <= 11){
            System.out.println("Autumn");
        }
        sc.close();
    }
}
