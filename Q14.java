public class Q14 {
    public static void main(String[] args){
        int arr[] = new int[10];
        int result = 0;
        System.out.print("Random numbers : ");
        for (int i = 0; i < 10; i++){
            arr[i] = (int)(Math.random()*10 + 1);
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < 10; i++){
            result += arr[i];
        }
        System.out.print("\nAverage : " + (double)result/10);
    }
}