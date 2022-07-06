class TV{
    int size;
    public TV(int size){
        this.size = size;
    }
    protected int getSize(){
        return size;
    }
}
class ColorTV extends TV{
    private int color;
    public ColorTV(int size, int color){
        super(size);
        this.color = color;
    }
    protected int getColor(){
        return color;
    }
    public void printProperty(){
        System.out.println(getSize() + " inches, " + getColor() + " colors");
    }
}
public class Q28{
    public static void main(String[] args){
        ColorTV myTV = new ColorTV(64, 1024);
        myTV.printProperty();
    }
}