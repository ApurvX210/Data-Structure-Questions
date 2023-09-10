import java.util.Stack;

public class StackPermutation {
    public static int isStackPermutation(int n, int[] ip, int[] op) {
        Stack<Integer> s=new Stack<>();
        int x=0;
        int y=0;
        while(x<n && y<n){
            if(s.size()>0 && op[y]==s.peek()){
                s.pop();
                y++;
            }
            else if(ip[x]!=op[y]){
                s.push(ip[x]);
                x++;
            }
            else if(ip[x]==op[y]){
                x++;
                y++;
            }

        }
        if(y==n){
            return 1;
        }else{
            return 0;
        }
        
        
    }
    public static void main(String[] args) {
        int input[] = { 2,4,3,1};
 
        // Output Queue
        int output[] = { 2, 1, 3 };
        System.out.println(4,input,output);
        int n = 3;
    }
    
}
