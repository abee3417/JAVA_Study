import java.util.Scanner;
public class Q05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tenP;
        System.out.print("Input integer(1~99) :");
        tenP = sc.nextInt();
        if (tenP >= 10){ 
            int oneP; 
            oneP = tenP % 10;
            tenP /= 10;
            if (tenP % 3 == 0 && oneP % 3 == 0){
                System.out.println("Clap, Clap");
            }
            else if (tenP % 3 == 0 || oneP % 3 == 0){
                System.out.println("Clap");
            }
        }
        else {
            if (tenP % 3 == 0){
                System.out.println("Clap");
            }
        }
        sc.close();
    }
}
