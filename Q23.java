import java.util.Scanner;
class Circle_23{ // class Circle, 24번과 클래스 이름이 겹쳐서 클래스 이름을 바꿨습니다.
    private double x, y;
    private int radius;
    public Circle_23(double x, double y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius; // initialize x, y, and radius
    }
    public void show(){
        System.out.println("(" + this.x + ", " + this.y + ") r = " + this.radius);
    }
}
public class Q23{ // public class CircleManager
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Circle_23 c[] = new Circle_23[3]; // Circle array with 3 elements
        for (int i = 0; i < c.length; i++){
            System.out.print("x, y, radius >> "); // println으로 하면 >> 아랫줄에 입력받게 되어 print로 수정하였습니다.
            double x = sc.nextDouble(); // read x
            double y = sc.nextDouble(); // read y
            int radius = sc.nextInt(); // read radius
            c[i] = new Circle_23(x, y, radius); // create Circle object
        }
        for (int i = 0; i < c.length; i++){
            c[i].show(); // Call show() of all objects.
        }
        sc.close();
    }
}