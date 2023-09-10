import java.util.Stack;

public class infixtopostfix {
    public static String infixToPostfix(String exp) {
        Stack<Character> s=new Stack<>();
        String ans="";
        for(int i=0;i<exp.length();i++){
            Character c=exp.charAt(i);
            if((c>='a' && c<='z') || (c>='A' && c<='Z')){
                ans+=c+"";
            }else if(c=='+' || c=='-' || c=='*' || c=='/' || c=='^' || c=='('){
                if(c=='^'){
                    s.push(c);
                }
                else if(c=='('){
                    s.push(c);
                }
                else if(c=='*'){
                    if(s.size()==0){
                        s.push(c);
                        continue;
                    }
                    while(s.peek()=='^'){
                        ans+=s.pop()+"";
                        if(s.size()==0){
                            break;
                        }
                    }
                    s.push(c);
                }else if(c=='/'){
                    if(s.size()==0){
                        s.push(c);
                        continue;
                    }
                    while(s.peek()=='^' || s.peek()=='*'){
                        ans+=s.pop()+"";
                        if(s.size()==0){
                            break;
                        }
                    }
                    s.push(c);
                }
                else if(c=='+'){
                    if(s.size()==0){
                        s.push(c);
                        continue;
                    }
                    while(s.peek()=='^' || s.peek()=='*' || s.peek()=='/' ){
                        ans+=s.pop()+"";
                        if(s.size()==0){
                            break;
                        }
                    }
                    s.push(c);
                }
                else if(c=='-'){
                    if(s.size()==0){
                        s.push(c);
                        continue;
                    }
                    while(s.peek()=='^' || s.peek()=='*' || s.peek()=='/' || s.peek()=='+'){
                        ans+=s.pop()+"";
                        if(s.size()==0){
                            break;
                        }
                    }
                    s.push(c);
                }
            }else if(c==')'){
                while(s.peek()!='('){
                    ans+=s.pop()+"";
                }
                s.pop();
            }
        }
        while(s.size()!=0){
            ans+=s.pop()+"";
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(s));
    }
}
