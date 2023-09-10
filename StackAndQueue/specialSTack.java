import java.util.Stack;

public class specialSTack {
    static int ans = Integer.MAX_VALUE;

    public void push(int a, Stack<Integer> s) {
        s.push(a);
    }

    public int pop(Stack<Integer> s) {
        return s.pop();
    }

    public static int min(Stack<Integer> s) {
        if (s.size() == 0) {
            return ans;
        }
        int num = s.pop();
        ans = Integer.min(ans, num);
        int val = min(s);
        s.push(num);
        return ans;
    }

    public boolean isFull(Stack<Integer> s, int n) {
        if (s.size() == n) {
            return true;
        }
        return false;
    }

    public boolean isEmpty(Stack<Integer> s) {
        if (s.size() == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(18);
        s.push(19);
        s.push(29);
        s.push(15);
        s.push(16);
        System.out.println(min(s));

    }
}
