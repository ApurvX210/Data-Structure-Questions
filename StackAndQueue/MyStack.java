import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> q=new LinkedList<>();
    Queue<Integer> q1=new LinkedList<>();
    public MyStack() {

    }

    public void push(int x) {
        q.add(x);
    }

    public int pop() {
        while(q.size()!=1){
            q1.add(q.poll());
        }
        int a=q.poll();
        while(q1.size()!=0){
            q.add(q1.poll());
        }
        return a;
    }

    public int top() {
        while(q.size()!=1){
            q1.add(q.poll());
        }
        int a=q.peek();
        q1.add(q.poll());
        while(q1.size()!=0){
            q.add(q1.poll());
        }
        return a;
    }

    public boolean empty() {
        if(q.size()==0){
            return true;
        }
        return false;
    }

}
