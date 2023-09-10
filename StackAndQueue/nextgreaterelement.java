import java.util.Stack;
public class nextgreaterelement {
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        long[] ans=new long[n];
        int j=0;
        Stack<Integer> s=new Stack<>();
        s.push(0);
        for(int i=1;i<n;i++){
            while(s.size()>0 && arr[s.peek()]<arr[i]){
                ans[s.peek()]=arr[i];
                s.pop();
            }
            s.add(i);
        }
        while(s.empty()!=true){
            ans[s.peek()]=-1;
            s.pop();
        }
        return ans;
    }
}
