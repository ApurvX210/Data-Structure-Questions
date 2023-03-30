import java.util.ArrayList;

public class rabin {
    public static ArrayList<Integer> search(String pat, String S)
    {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<S.length();i++){
            boolean c=true;
            int t=-1;
            int j;
            if(pat.charAt(i)==S.charAt(0)){
                for(j=1;j<S.length();j++){
                    if(i+j<S.length()){
                        if(S.charAt(i+j)==pat.charAt(0) && c){
                            t=i+j;
                            c=false;
                        }
                        if(S.charAt(i+j)!=pat.charAt(j)){
                            break;
                        }
                    }
                }
                if(j==pat.length()){
                    // System.out.println(i+1);
                    a.add(i+1);
                }
                if(c==false){
                    i=t+1;
                }
            }
            
        }
        if(a.isEmpty()){
            a.add(-1);
        }
        return a;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a=search("cxggbw", "q");
        for(int i:a){
            System.out.println(i);
        }
    }
}
