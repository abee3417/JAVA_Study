import java.util.Scanner;
class Grade{
    private int math, science, english;
    public Grade(int math, int science, int english){
        this.math = math;
        this.science = science;
        this.english = english;
    }
    public int average(){
        return ((this.math + this.science + this.english) / 3);
    }
}
public class Q20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input scores in order of Math, Science and English >> ");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("Average : " + me.average());
        scanner.close();
    }
}
