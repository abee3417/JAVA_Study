import java.util.Scanner;
public class Q13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.print("Input 10 positive integers >> ");
        for (int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Multiples of 3 : ");
        for (int i = 0; i < 10; i++){
            if (arr[i] % 3 == 0){
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}