// class TV, ColorTV는 Q28.java에 있으므로 작성 X
class IPTV extends ColorTV{
    private String IP;
    public IPTV(String IP, int size, int color){
        super(size, color);
        this.IP = IP;
    }
    protected String getIP(){
        return IP;
    }
    @Override
    public void printProperty(){
        System.out.println("My IPTV is " + getSize() + " inches, " + getColor() + " colors and IP address is " + getIP());
    }
}
public class Q29{
    public static void main(String[] args){
        IPTV myTV = new IPTV("192.1.1.2", 64, 1024);
        myTV.printProperty();
    }
}