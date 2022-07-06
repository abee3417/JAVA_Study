// Q5.java의 Student 클래스 이용
import java.util.Scanner;
import java.util.HashMap;
import java.util.StringTokenizer;

class Manage_Q6{
    private Scanner scanner = new Scanner(System.in);
    private HashMap<String, Student> h = new HashMap<String, Student>();
    private String ns[];
    private void read(){
        System.out.println("Enter student name, major, id and average of grade.");
        for (int i=0; i<4; i++) {
            System.out.print(">> ");
            String text = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(text, ",");
            String name = st.nextToken().trim();
            String department = st.nextToken().trim();
            String id = st.nextToken().trim();
            double grade = Double.parseDouble(st.nextToken().trim());
            // TODO : Add your code at here to save information
            Student s = new Student(name, department, id, grade);
            h.put(name, s);
        }
        ns = h.keySet().toArray(new String[4]); // hashmap의 key (즉 이름들)만 모아서 배열로 저장
    }
    private void printAll(){
        for (int i = 0; i < h.size(); i++){
            System.out.println("---------------------------");
            System.out.println("Name : " + ns[i]);
            System.out.println("Major : " + h.get(ns[i]).getMajor());
            System.out.println("ID : " + h.get(ns[i]).getId());
            System.out.println("Avg. Grade : " + h.get(ns[i]).getGrade());
            System.out.println("---------------------------");
        }
    }
    private void processQuery(){
        while(true){
            System.out.print("Student name >> ");
            String inputName = scanner.next();
            if(inputName.equals("exit")){
                break;
            }
            for (int i = 0; i < h.size(); i++){
                if (ns[i].equals(inputName)){
                    System.out.println(ns[i] + ", " + (h.get(ns[i]).getMajor()) + ", " + (h.get(ns[i]).getId()) + ", " + (h.get(ns[i]).getGrade()));
                }
            }
        }
        scanner.close();
    }
    public void run(){
        this.read();
        this.printAll();
        this.processQuery();
    }
}

public class Q42 {
    public static void main(String[] args){
       Manage_Q6 me = new Manage_Q6();
       me.run();
    }
}