// Q5.java에 Shape 인터페이스, Circle 클래스 존재
class Rect implements Shape{
    private double w, h;
    public Rect(double w, double h){
        this.w = w;
        this.h = h;
    }
    public void draw(){
        System.out.println("Rectangle with size " + w + "x" + h);
    }
    public double getArea(){
        return (w * h);
    }
}

public class Q36 {
    public static void main(String[] args) {
        Shape [] list = new Shape[2];
        list[0] = new Circle(10); // Circle with Radius 10
        list[1] = new Rect(10, 40); // 10x40 Rectangle
        for(int i=0;i<list.length;i++) list[i].redraw();
        for(int i=0;i<list.length;i++){
            System.out.println("Area : "+ list[i].getArea());
        }
    }
}
