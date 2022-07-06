import java.util.Scanner;
public class Q18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String course[] = {"Java", "C++", "HTML", "Kotlin", "Python"};
        int score[] = {95, 88, 76, 62, 55};
        while(true){
            System.out.print("Subject >> ");
            String name = sc.next();
            if(name.equals("Quit")){
                break;
            }
            else{
                for (int i = 0; i < 5; i++){
                    if(course[i].equals(name)){
                        System.out.println("Score is " + score[i]);
                        break;
                    }
                    if(i == 4){ // 끝까지 찾아봤는데 없을 경우
                        System.out.println("Invalid subject");
                    }
                }
            }          
        }
        sc.close();
    }
}