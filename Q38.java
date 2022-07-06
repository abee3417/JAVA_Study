import java.util.Scanner;
import java.util.ArrayList;

public class Q38 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> al = new ArrayList<Character>();
        double avg = 0;
        System.out.print("Enter grades of 6 students (A/B/C/D/F)>> ");
        for (int i = 0; i < 6; i++){
            char grade = sc.next().charAt(0);
            al.add(grade);
        }
        for (int i = 0; i < al.size(); i++){
            if (al.get(i) == 'A') avg += 4.0;
            else if (al.get(i) == 'B') avg += 3.0;
            else if (al.get(i) == 'C') avg += 2.0;
            else if (al.get(i) == 'D') avg += 1.0;
            else if (al.get(i) == 'F') avg += 0.0;
            else{
                System.out.println("Invalid");
                break;
            }

            if (i == al.size() - 1){
                System.out.println("Average : " + avg / 6);
            }
        }
        sc.close();
    }
}
