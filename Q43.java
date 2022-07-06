import java.util.Scanner;
import java.util.HashMap;
import java.util.StringTokenizer;

class Location{
    private String name;
    private double lat, lon;
    public Location(String name, double lat, double lon){
        this.name = name;
        this.lat = lat;
        this.lon = lon;
    }
    public String getName(){
        return this.name;
    }
    public double getLat(){
        return this.lat;
    }
    public double getLon(){
        return this.lon;
    }
}

class Manage_Q7{
    private Scanner scanner = new Scanner(System.in);
    private HashMap<String, Location> h = new HashMap<String, Location>();
    private String ns[];
    private void read(){
        System.out.println("Enter City name, latitude, longitude");
        for (int i=0; i<4; i++) {
            System.out.print(">> ");
            String text = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(text, ",");
            String name = st.nextToken().trim();
            double lat = Double.parseDouble(st.nextToken().trim());
            double lon = Double.parseDouble(st.nextToken().trim());
            // TODO : Add your code at here to save information
            Location s = new Location(name, lat, lon);
            h.put(name, s);
        }
        ns = h.keySet().toArray(new String[4]); // hashmap의 key (즉 이름들)만 모아서 배열로 저장
    }
    private void printAll(){
        System.out.println("---------------------------");
        for (int i = 0; i < h.size(); i++){
            System.out.print(ns[i] + "\t");
            System.out.print(h.get(ns[i]).getLat() + "\t");
            System.out.println(h.get(ns[i]).getLon() + "\t");
        }
        System.out.println("---------------------------");
    }
    private void processQuery(){
        while(true){
            System.out.print("City name >> ");
            String inputName = scanner.next();
            if(inputName.equals("exit")){
                break;
            }
            for (int i = 0; i < h.size(); i++){
                if (ns[i].equals(inputName)){
                    System.out.println(ns[i] + "\t" + (h.get(ns[i]).getLat()) + "\t" + (h.get(ns[i]).getLon()));
                    break;
                }
                if (i == h.size() - 1){ // 끝까지 돌았는데 없는 경우
                    System.out.println("Location of " + inputName + " is unknown.");
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

public class Q43 {
    public static void main(String[] args){
       Manage_Q7 me = new Manage_Q7();
       me.run();
    }
}