import java.util.Scanner;
import java.util.HashMap;

public class Q44 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap <String, Double> h = new HashMap<String, Double>();
        System.out.println("DK Scholarship management system.");
        for (int i = 0; i < 5; i++){
            System.out.print("Name & grade >> ");
            String name = sc.next();
            double grade = sc.nextDouble();
            h.put(name, grade);
        }
        String ns[] = h.keySet().toArray(new String[5]);
        System.out.print("Input grade limitation >> ");
        double limit = sc.nextDouble();
        System.out.print("Scholarship students : ");
        for (int i = 0; i < h.size(); i++){
            if(h.get(ns[i]) >= limit){
                System.out.print(ns[i] + " ");
            }
        }
        sc.close();
    }    
}
