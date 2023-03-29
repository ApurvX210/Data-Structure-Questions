public class wildcard {
    static boolean match(String wild, String pattern)
    {
        boolean flag=true;
        int i=0;
        int j=0;
        while(j<pattern.length()){
            if(wild.charAt(i)==pattern.charAt(j)){
                i++;
                j++;
            }else if(wild.charAt(i)=='?'){
                i++;
                j++;
            }else if(wild.charAt(i)=='*'){
                if(i==wild.length()-1){
                    return true;
                }
                i++;
                while((wild.charAt(i)=='?' || wild.charAt(i)=='*') && i<wild.length()){
                    i++;
                    
                }
                if(i==wild.length()){
                    return true;
                }
                int cnt=i;
                while((wild.charAt(i)!='?' && wild.charAt(i)!='*') && i<wild.length()){
                    i++;
                    if(i==wild.length()){
                        i--;
                        break;
                    }
                }
                if(i!=wild.length()-1){
                    
                    while(pattern.substring(j, j+(i-cnt)).compareTo(wild.substring(cnt,i))>0){
                        j++;
                    }
                    j=j+(i-cnt+1);
                    
                }else{
                    if(pattern.substring(pattern.length()-(i-cnt)-1).compareTo(wild.substring(cnt))>0){
                        return false;
                    }else{
                        j=pattern.length()-1;
                    }
                }
                
                if(j==pattern.length()){
                    return false;
                }
            }else{
                return false;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        System.out.println(match("ba*a?", "baaabab"));
    }
}
