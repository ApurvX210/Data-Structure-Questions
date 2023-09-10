import java.util.Stack;
public class redundantparenthesis {
    public static int checkRedundancy(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || (s.charAt(i)>='a' && s.charAt(i)<='z') || s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/'){
                st.push(s.charAt(i));
            }else if(s.charAt(i)==')'){
                int c=0;
                if(st.peek()=='('){
                    return 1;
                }
                while(st.peek()!='('){
                    if(st.peek()=='+' || st.peek()=='-' || st.peek()=='*' || st.peek()=='/' ){
                        c++;
                    }
                    st.pop();
                }
                if(c==0){
                    return 1;
                }
                st.pop();
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String s="(a-(a+b))";
        System.out.println(checkRedundancy(s));
    }
}
