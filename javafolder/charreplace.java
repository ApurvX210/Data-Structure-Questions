import java.util.Hashtable;

public class charreplace {
    public int characterReplacement(String s, int k) {
        Hashtable<Character,Integer> Fans=new Hashtable<>();
        Hashtable<Character,Integer> kval=new Hashtable<>();
        Hashtable<Character,Integer> ind=new Hashtable<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if(ind.containsKey(c)){
                // String m=h.get(c);
                // if(m.length()==1){
                //     int n=Integer.parseInt(m);
                //     int a;
                //     if(k-(i-n-1)<(s.length()-n-i+1)){
                //         a=i-n+1+(k-(i-n-1));
                //     }else{
                //         a=s.length();
                //     }
                //     ans=Integer.max(ans, a);
                //     h.put(c, m+i+"");
                // }else{
                //     int n=Integer.parseInt(s.charAt(0)+"");
                //     int n1=Integer.parseInt(s.charAt(1)+"");
                    
                // }
                int kv=kval.get(c);
                int a=Fans.get(c);
                int index=ind.get(c);
                if(i-index>kv){
                    
                }

            }else{
                ind.put(c, i);
                kval.put(c, k);
                Fans.put(c, 1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
