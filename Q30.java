class Point{
    private int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    protected void move(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class ColorPoint_30 extends Point{ // class ColorPoint, 31번과 클래스 이름이 겹쳐서 클래스 이름을 바꿨습니다.
    private String color;
    public ColorPoint_30(int x, int y, String color){
        super(x, y);
        this.color = color;
    }
    public void setXY(int x, int y){
        this.move(x, y);
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
public class Q30 {
    public static void main(String[] args){
        ColorPoint_30 cp = new ColorPoint_30(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str);
    }
}
