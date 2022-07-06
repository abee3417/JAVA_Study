import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Q45 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <String> ns = new ArrayList<String>();
        HashMap <String, Integer> h = new HashMap<String, Integer>();
        System.out.println("** REWARD Management System **");
        while(true){
            System.out.print("Enter name & reward point >> ");
            String name = sc.next();
            if (name.equals("exit")){
                break;
            }
            int point = sc.nextInt();
            if (h.containsKey(name)){
                h.put(name, h.get(name) + point);
            }
            else{
                h.put(name, point);
                ns.add(name);
            }
            for (int i = h.size() - 1; i >= 0; i--){
                System.out.print("(" + ns.get(i) + "," + h.get(ns.get(i)) + ")");
            }
            System.out.println();
        }
        sc.close();
    }    
}

