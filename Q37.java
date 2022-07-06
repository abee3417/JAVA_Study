import java.util.Scanner;
import java.util.Vector;

public class Q37 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        int num, max = 0;
        System.out.print("Enter integer(-1 to quit)>> ");
        while (true){
            num = sc.nextInt();
            if (num == -1){
                break;
            }
            else{
                v.add(num);
                if (num > max){
                    max = num;
                }
            }
        }
        System.out.println("Maximum number is " + max);
        sc.close();
    }
}
