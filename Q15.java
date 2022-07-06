import java.util.Scanner;
public class Q15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of elements : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < num; i++){
            arr[i] = (int)(Math.random()*100 + 1);
            System.out.print(arr[i] + " ");
            if ((i + 1) % 10 == 0){
                System.out.print("\n");
            }
        }
        sc.close();
    }
}