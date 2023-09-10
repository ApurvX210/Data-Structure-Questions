import java.util.Stack;
public class sortstack {
    public void recursion(Stack<Integer> s,int num){
        if(s.size()==0 || num>s.peek()){
            s.add(num);
            return;
        }else{
            int n=s.pop();
            recursion(s, num);
            s.add(n);
        }
    }
    public void sort1(Stack<Integer> s)
	{
		if(s.size()>1){
            int num=s.pop();
            sort1(s);
            recursion(s, num);
        }
	}
    public Stack<Integer> sort(Stack<Integer> s)
	{
		sort1(s);
        return s;
	}
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        sortstack m=new sortstack();
        m.sort(s);
        System.out.println(s);
        while(s.size()>0){
            System.out.print(s.pop());
        }
    }
}
