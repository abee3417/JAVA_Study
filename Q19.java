class TV_19{  // class TV, 28번과 클래스 이름이 겹쳐서 클래스 이름을 바꿨습니다.
    private String company;
    private int year;
    private int inch;
    public TV_19(String company, int year, int inch){
        this.company = company;
        this.year = year;
        this.inch = inch;
    }
    public void show(){
        System.out.println("My TV is " + this.inch + " inches manufactured by " + this.company + " in " + this.year + ".");
    }
}
public class Q19{
    public static void main(String[] args){
        TV_19 myTV = new TV_19("LG", 2021, 85);
        myTV.show();
    }
}