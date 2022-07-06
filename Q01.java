import java.util.Scanner;
public class Q01 {
    public static void main(String[] args){
        int krw;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input KRW >> ");
        krw = sc.nextInt();
        System.out.println(krw + " KRW is " + krw/1100.0 + " USD");
        sc.close();
    }
}
