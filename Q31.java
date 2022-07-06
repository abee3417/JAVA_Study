// Point는 Q30.java에 있으므로 작성 X
class ColorPoint_31 extends Point{ // class ColorPoint, 30번과 클래스 이름이 겹쳐서 클래스 이름을 바꿨습니다.
    private String color;
    public ColorPoint_31(){
        this(0, 0);
        this.setColor("BLACK");
    }
    public ColorPoint_31(int x, int y){
        super(x, y);
    }
    public void setXY(int x, int y){
        move(x, y);
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        return (getColor() + " color on (" + getX() + ", " + getY() + ")");
    }
}
public class Q31 {
    public static void main(String[] args){
        ColorPoint_31 zeroPoint = new ColorPoint_31();
        System.out.println(zeroPoint.toString());

        ColorPoint_31 cp = new ColorPoint_31(10, 10);
        cp.setXY(5, 5);
        cp.setColor("RED");
        System.out.println(cp.toString());
    }
}
