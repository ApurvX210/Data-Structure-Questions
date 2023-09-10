import java.util.Stack;

public class postfix {
    public static int evaluatePostFix(String S) {
        Stack<Integer> s = new Stack<>();
        for (int m=0;m<S.length();m++) {
            Character i=S.charAt(m);
            if (i == '+' || i == '-' || i == '*' || i == '/') {
                int n = s.pop();
                int m = s.pop();
                switch (i) {
                    case '+':
                        s.push(m + n);
                        break;
                    case '-':
                        s.push(m - n);
                        break;
                    case '*':
                        s.push(m * n);
                        break;
                    case '/':
                        s.push(m / n);
                        break;
                }

            }else{
                s.push(Integer.parseInt(i+""));
            }
        }
        return s.pop();
    }
}
