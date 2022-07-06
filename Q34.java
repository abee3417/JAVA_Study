import java.util.Scanner;

abstract class Calc{
    abstract public void setValue(int a, int b);
    abstract public int calculate();
    protected int a, b;
}

// 덧셈 
class Add extends Calc{
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return a + b;
    }
}

// 뺼셈
class Sub extends Calc {
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return a - b;
    }
}

// 곱셈
class Mul extends Calc{
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return a * b;
    }
}

// 나눗셈
class Div  extends Calc{
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return a / b;
    }
}

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        char op;
        System.out.print("Enter 2 operands & operator >> ");
        n1 = sc.nextInt();
        op = sc.next().charAt(0);
        n2 = sc.nextInt();
        switch (op) {
        case '+':
            Add add = new Add();
            add.setValue(n1, n2);
            System.out.println(add.calculate());
            break;
        case '-':
            Sub sub = new Sub();
            sub.setValue(n1, n2);
            System.out.println(sub.calculate());
            break;
        case '*':
            Mul mul = new Mul();
            mul.setValue(n1, n2);
            System.out.println(mul.calculate());
            break;
        case '/':
            Div div = new Div();
            div.setValue(n1, n2);
            System.out.println(div.calculate());
            break;
        }
        sc.close();
    }
}