import java.util.*;
public class smallWind {
    public static String smallestwindow(String s,String p){
        String ans="";
        int a[]=new int[26];
        HashMap<Character, List<Integer>> h = new HashMap<>();
        for(int i=0;i<26;i++){
            a[i]=-1;
        }
        for(int i=0;i<p.length();i++){
            if(a[p.charAt(i)-'a']==-1){
                a[p.charAt(i)-'a']=0;
            }
            a[p.charAt(i)-'a']+=1;
        }
        int count=p.length();
        Character c='0';
        int st=-1;
        for(int i=0;i<s.length();i++){
            if(a[s.charAt(i)-'a']!=-1){
                if(a[s.charAt(i)-'a']>0){
                    count--;
                    a[s.charAt(i)-'a']--;
                }
                if(st==-1){
                    c=s.charAt(i);
                    st=i;
                    continue;
                }
                if(h.containsKey(c)){
                    List<Integer> l=h.get(c);
                    if(l.get(l.size()-1)==-1){
                        l.remove(l.size()-1);
                    }
                    l.add(i);
                    h.put(c,l);
                }else{
                    List<Integer> l=new ArrayList<>();
                    l.add(i);
                    h.put(c, l);
                }
                c=s.charAt(i);
                if(h.containsKey(c)){
                    List<Integer> l=h.get(c);
                    l.add(-1);
                    h.put(c,l);
                }else{
                    List<Integer> l=new ArrayList<>();
                    l.add(-1);
                    h.put(c, l);
                }
                if(s.charAt(st)==s.charAt(i) && a[s.charAt(i)-'a']==0){
                    List<Integer> l=h.get(c);
                    Character m=s.charAt(st);
                    st=l.get(0);
                    l.remove(0);
                    h.put(m, l);
                }
                if(count==0){
                    if(ans.length()==0 || ans.length()>i-st+1){
                        ans=s.substring(st, i+1);
                    }
                    while(h.get(s.charAt(st)).size()!=1){
                        List<Integer> l=h.get(s.charAt(st));
                        Character m=s.charAt(st);
                        st=l.get(0);
                        l.remove(0);
                        h.put(m, l);
                        if(ans.length()==0 || ans.length()>i-st+1){
                            ans=s.substring(st, i+1);
                        }
                    }   
                }
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(smallestwindow("timetopractice", "toc"));
    }
}
