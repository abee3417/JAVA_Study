import java.util.Scanner;
public class Q11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input integer >> ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++){
            for (int j = 5; j > i; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
