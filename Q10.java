import java.util.Scanner;
public class Q10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String opt;
        double n1, n2;
        System.out.print("Enter >> ");
        n1 = sc.nextDouble();
        opt = sc.next();
        n2 = sc.nextDouble();
        switch(opt){
            /*
            문제에는 double로 두 수를 받으라고 하셨는데
            출력예시는 int로 되있습니다.
            그래서 int로 형변환을 하려 했으나,
            이럴 경우 3.6 + 3.7과 같은 소수 계산을 할 때
            계산이 정확하지 않게 나온다는 점에서
            출력을 문제 예시와 다르게 double로 출력하게 됬습니다.
            */
            case "+" :
                System.out.println(n1 + " " + opt + " " + n2 + " = " + (n1+n2));
                break;
            case "-" :
                System.out.println(n1 + " " + opt + " " + n2 + " = " + (n1-n2));
                break;
            case "*" :
                System.out.println(n1 + " " + opt + " " + n2 + " = " + (n1*n2));
                break;
            case "/" :
                if (n2 == 0){
                    System.out.println("Divide by 0 error");
                }
                else{
                    System.out.println(n1 + " " + opt + " " + n2 + " = " + (n1/n2));
                }
                break;
            default :
                break;
        }
        sc.close();
    }
}
