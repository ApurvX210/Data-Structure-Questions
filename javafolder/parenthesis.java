import java.util.*;
public class parenthesis {
    public static boolean isValid(String s) {
        Stack st=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                while(true){
                    Character m;
                    if(st.empty()){
                        return false;
                    }else{
                        m=(Character)st.peek();
                    }
                    if(m=='}' || m==')' || m==']'){
                        st.pop();
                    }else if(m=='('){
                        st.pop();
                        break;
                    }else{
                        return false;
                    }
                }
                
            }else if(s.charAt(i)=='}'){
                while(true){
                    Character m;
                    if(st.empty()){
                        return false;
                    }else{
                        m=(Character)st.peek();
                    }
                    if(m=='}' || m==')' || m==']'){
                        st.pop();
                    }else if(m=='{'){
                        st.pop();
                        break;
                    }else{
                        return false;
                    }
                }
                
            }else if(s.charAt(i)==']'){
                while(true){
                    Character m;
                    if(st.empty()){
                        return false;
                    }else{
                        m=(Character)st.peek();
                    }
                    if(m=='}' || m==')' || m==']'){
                        st.pop();
                    }else if(m=='['){
                        st.pop();
                        break;
                    }else{
                        return false;
                    }
                }
                
            }
        }
        if(st.empty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String s="(]";
        System.out.println(isValid(s));
    }
}
