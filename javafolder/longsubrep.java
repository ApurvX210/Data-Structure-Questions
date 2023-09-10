import java.util.*;
public class longsubrep {
    public static int lengthOfLongestSubstring(String s) {
        Hashtable<Character,Integer> h=new Hashtable<>();
        int ans=0;
        int result=0;
        int cnt=0;
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if(h.containsKey(c)){
                int m=h.get(c);
                if(m<cnt){
                    h.put(c, i+1);
                    ans++;
                    result=Integer.max(result, ans);
                    continue;
                }
                ans=ans-m+cnt+1;
                result=Integer.max(result, ans);
                cnt=m;
                h.put(c,i+1);
            }else{
                ans++;
                result=Integer.max(result, ans);
                h.put(c,i+1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s="pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
