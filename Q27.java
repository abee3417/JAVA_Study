import java.util.Scanner;
class ReservedSystem{
    private Locate seatArr[] = new Locate[3];
    private String levelArr[] = {"S", "A", "B"};
    public ReservedSystem(){
        for (int i = 0; i < 3; i++){
            seatArr[i] = new Locate();
            seatArr[i].setLevel(levelArr[i]);
        }
    }
    public boolean overlap(String name){ // 중복 예매 확인 함수
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 10; j++){
                if(seatArr[i].getSeat(j).equals(name)){
                    return true;
                }
            }
        }
        return false;
    }
    public void reserve(int grade, Scanner sc){ // 1. Reservation
        seatArr[grade - 1].print();
        System.out.print("Name >> ");
        String name = sc.next();
        if (overlap(name) == true){
            System.out.println("Already reserved name."); // 예외처리 : 같은 사람이 다시 중복예약할 경우
            return;
        }
        System.out.print("Sheet number >> ");
        int num = sc.nextInt();
        seatArr[grade - 1].add(name, num);
    }
    public void show(){ // 2. Status
        System.out.print("\n");
        for (int i = 0; i < 3; i++){
            seatArr[i].print();
        }
    }
    public void cancel(int grade, Scanner sc){ // 3. Cancel
        System.out.print("Name >> ");
        String name = sc.next();
        seatArr[grade - 1].delete(name);
    }
}
class Locate{
    private String seat[] = {"-1-", "-2-", "-3-", "-4-", "-5-", "-6-", "-7-", "-8-", "-9-", "-10-"};
    private String level;
    public void setLevel(String level){
        this.level = level;
    }
    public void print(){ // 좌석 현황 출력
        System.out.print("Class " + this.level + " >> ");
        for (int i = 0; i < 10; i++){
            System.out.print(seat[i] + " ");
        }
        System.out.print("\n");
    }
    public void add(String name, int num){ // 이름 추가
        if (num < 1 || 10 < num){
            System.out.println("Error seat number."); // 예외처리 : 잘못된 좌석 번호를 입력
        }
        else if (!this.seat[num - 1].equals("-" + num + "-")){
            System.out.println("Already reserved seat."); // 예외처리 : 이미 있는 좌석을 다시 예약
        }
        else{
            this.seat[num - 1] = name;
            System.out.println(this.level + " class sheet #" + num + " reserved for " + name);
        }   
    }
    public void delete(String name){ // 이름 제거
        for (int i = 0; i < 10; i++){
            if (name.equals(this.seat[i])){
                this.seat[i] = "-" + (i + 1) + "-";
                System.out.println("Reservation for " + name + ", Class " + this.level + " #" + (i + 1) + " cancelled.");
                break;
            }
            if (i == 9){ // 예외처리 : 끝까지 찾아봤지만 맞는 이름이 없을 경우
                System.out.println("Not found");
            }
        }
    }
    public String getSeat(int index){
        return this.seat[index];
    }
}
public class Q27{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ReservedSystem sys = new ReservedSystem();
        System.out.println("DK Concert hall reservation system");
        while(true){
            System.out.print("1 : Reservation\n2 : Status\n3 : Cancel\n4 : Quit\n>>> ");
            int opt = sc.nextInt();
            if (opt == 1){
                System.out.print("Class S(1), A(2), B(3) >> ");
                int grade = sc.nextInt();
                if ((grade != 1)&&(grade != 2)&&(grade != 3)){
                    System.out.println("Error class number."); // 예외처리 : 잘못된 등급을 입력
                }
                else{
                    sys.reserve(grade, sc);
                } 
            }
            else if (opt == 2){
                sys.show();
            }
            else if (opt == 3){
                System.out.print("Class S(1), A(2), B(3) >> ");
                int grade = sc.nextInt();
                if ((grade != 1)&&(grade != 2)&&(grade != 3)){
                    System.out.println("Error class number."); // 예외처리 : 잘못된 등급을 입력
                }
                else{
                    sys.cancel(grade, sc);
                }
            }
            else if (opt == 4){
                break;
            }
            else{
                System.out.println("Error option."); // 예외처리 : 1~4가 아닌 없는 옵션을 선택할 경우
            }
            System.out.print("\n");
        }
        sc.close();
    }
}