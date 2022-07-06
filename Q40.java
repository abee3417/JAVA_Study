import java.util.Scanner;
import java.util.Vector;

public class Q40 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        int rainfall;
        int avg = 0;
        while (true){
            System.out.print("Enter amount of rainfall (0 to quit)>> ");
            rainfall = sc.nextInt();
            if (rainfall == 0){
                break;
            }
            else{
                v.add(rainfall);
                for (int i = 0; i < v.size(); i++){
                    System.out.print(v.get(i) + " ");
                    avg += v.get(i);
                }
            }
            System.out.println("\nCurrent Average : " + avg / v.size());
            avg = 0;
        }
        sc.close();
    }
}
