import java.util.Scanner;
class Phone{
    private String name, Pnum;
    public Phone(String name, String Pnum){
        this.name = name;
        this.Pnum = Pnum;
    }
    public String getName(){
        return this.name;
    }
    public String getPnum(){
        return this.Pnum;
    }
}
class PhoneBook{
    private int count;
    public Phone list[];
    public PhoneBook(int num){
        this.count = num;
        list = new Phone[this.count];
    }
    public void setList(String name, String Pnum, int index){
        list[index] = new Phone(name, Pnum);
    }
    public void find(Scanner sc){
        while(true){
            System.out.print("Search >> ");
            String target = sc.next();
            if (target.equals("quit")){
                break;
            }
            else{
                for (int i = 0; i < this.count; i++){
                    if (target.equals(this.list[i].getName())){
                        System.out.println(this.list[i].getName() + " / " + this.list[i].getPnum());
                        break;
                    }
                    if (i == this.count - 1){ // 끝까지 찾았는데 없을 경우
                        System.out.println("Not found");
                    }
                }
            }
        }
    }
}
public class Q26{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of persons : ");
        int num = sc.nextInt();
        PhoneBook list = new PhoneBook(num);
        for (int i = 0; i < num; i++){
            System.out.print("Input name & phone number >> ");
            String name = sc.next();
            String Pnum = sc.next();
            list.setList(name, Pnum, i);
        }
        System.out.println("Saved...");
        list.find(sc);       
        sc.close();
    }
}