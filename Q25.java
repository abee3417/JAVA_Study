import java.util.Scanner;
class Day{
    private String todo;
    public void set(String todo){
        this.todo = todo;
    }
    public String get(){
        return todo;
    }
    public void show(){
        if (todo == null){
            System.out.println("Nothing to do");;
        }
        else{
            System.out.println(todo);
        }
    }
}
class MonthSchedule{
    private Day schedule[] = new Day[30];
    public MonthSchedule(){
        for (int i = 0; i < 30; i++){
            schedule[i] = new Day();
        }
    }
    public void input(String text, int date){ // 1번
        this.schedule[date - 1].set(text);
    }
    public void show(int date){ // 2번
        this.schedule[date - 1].show();
    }
    public void close(){ // 3번
        System.out.println("Quit program.");
    }

}
public class Q25{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MonthSchedule me = new MonthSchedule();
        int date, opt;
        while(true){
            System.out.print("Todo (Input:1, Show:2, Quit:3) >> ");
            opt = sc.nextInt();
            if (opt == 1){
                System.out.print("Date(1-30) : ");
                date = sc.nextInt();
                System.out.print("Todo(Enter string without space) ? ");
                String text = sc.next();
                me.input(text, date);
            }
            else if (opt == 2){
                System.out.print("Date(1-30) : ");
                date = sc.nextInt();
                me.show(date);
            }
            else if (opt == 3){
                me.close();
                break;
            }
        }
        sc.close();
    }
}