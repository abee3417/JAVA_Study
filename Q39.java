import java.util.Scanner;
import java.util.HashMap;

public class Q39 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        String nation;
        int num;
        System.out.println("Enter nation & population (Ex: Korea 5000)");
        while(true){
            System.out.print("Nation & population >> ");
            nation = sc.next();
            if (nation.equals("stop")){
                break;
            }
            num = sc.nextInt();
            h.put(nation, num);
        }
        while(true){
            System.out.print("Search population of ");
            nation = sc.next();
            if (nation.equals("exit")){
                break;
            }
            if (h.get(nation) == null){
                System.out.println("Cannot find " + nation);
            }
            else{
                System.out.println("Population of " + nation + " is " + h.get(nation));
            }
        }
        sc.close();
    }
}
