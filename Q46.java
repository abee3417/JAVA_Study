import java.util.Vector;

interface IStack<T>{
    public T pop();
    public boolean push(T ob);
}

class MyStack<T> implements IStack<T>{

    private Vector<T> v = new Vector<T>();
    public T pop(){
        if(v.size() == 0){
            return null;
        }
        else{
            T val = v.lastElement();
            v.remove(val);
            return val;
        }
    }
    public boolean push(T ob){
        v.add(ob);
        return true;
    }
}
public class Q46{ // StackManager 클래스
    public static void main (String[] args) {
        IStack<Integer> stack = new MyStack<Integer>();
        for (int i=0; i<10; i++) stack.push(i);
        while (true) {
            Integer n = stack.pop();
            if(n == null) break;
            System.out.print(n + " ");
        }
    }
}
