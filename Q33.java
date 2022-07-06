// Q1.java에 Converter 추상 클래스 존재
class Km2Mile extends Converter{
    protected double convert(double src){
        return (src / this.ratio);
    }
    protected String getSrcString(){
        return "KM";
    }
    protected String getDestString(){
        return "mile";
    }
    public Km2Mile(double ratio){
        this.ratio = ratio;
    }
}

public class Q33{
    public static void main(String[] args) {
        Km2Mile toMile = new Km2Mile(1.6);
        toMile.run();
    }
}