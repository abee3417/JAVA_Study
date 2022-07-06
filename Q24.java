import java.util.Scanner;
class Circle_24{ // class Circle, 23번과 클래스 이름이 겹쳐서 클래스 이름을 바꿨습니다.
    private double x, y;
    private int radius;
    public Circle_24(double x, double y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius; // initialize x, y, and radius
    }
    public void show(){
        System.out.println("Biggest circle info is (" + this.x + ", " + this.y + ") r = " + this.radius);
    }
    public int area(){ // 넓이를 반환해주는 메소드 추가
        return (this.radius * this.radius); // 3.14는 공통으로 곱해주므로 제외
    }
}
public class Q24{ // public class CircleManager
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Circle_24 c[] = new Circle_24[3]; // Circle array with 3 elements
        int max[] = new int[2]; // 넓이 비교를 위한 값, 가장 큰 원의 인덱스를 넣을 값. 이렇게 2개를 넣을 배열 선언
        max[0] = 0;
        for (int i = 0; i < c.length; i++){
            System.out.print("x, y, radius >> "); // println으로 하면 >> 아랫줄에 입력받게 되어 print로 수정하였습니다.
            double x = sc.nextDouble(); // read x
            double y = sc.nextDouble(); // read y
            int radius = sc.nextInt(); // read radius
            c[i] = new Circle_24(x, y, radius); // create Circle object
            if (max[0] <= c[i].area()){
                max[0] = c[i].area();
                max[1] = i;
            }
        }
        c[max[1]].show();
        sc.close();
    }
}