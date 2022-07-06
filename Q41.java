import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Student{
    private String name, major, id;
    private double grade;
    public Student(String name, String major, String id, double grade){
        this.name = name;
        this.major = major;
        this.id = id;
        this.grade = grade;
    }
    public String getName(){
        return this.name;
    }
    public String getMajor(){
        return this.major;
    }
    public String getId(){
        return this.id;
    }
    public double getGrade(){
        return this.grade;
    }
}

class Manage_Q5{
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Student> a = new ArrayList<Student>();
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
            a.add(s);
        }
    }
    private void printAll(){
        for (int i = 0; i < a.size(); i++){
            System.out.println("---------------------------");
            System.out.println("Name : " + a.get(i).getName());
            System.out.println("Major : " + a.get(i).getMajor());
            System.out.println("ID : " + a.get(i).getId());
            System.out.println("Avg. Grade : " + a.get(i).getGrade());
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
            for (int i = 0; i < a.size(); i++){
                if (a.get(i).getName().equals(inputName)){
                    System.out.println((a.get(i).getName()) + ", " + (a.get(i).getMajor()) + ", " + (a.get(i).getId()) + ", " + (a.get(i).getGrade()));
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

public class Q41 {
    public static void main(String[] args){
       Manage_Q5 me = new Manage_Q5();
       me.run();
    }
}
