public class prefix {
    public static String longestCommonPrefix(String[] strs) {
        String ans=strs[0];
        for(int i=1;i<strs.length;i++){
            String fans="";
            int size=Integer.min(ans.length(), strs[i].length());
            for(int j=0;j<size;j++){
                if(ans.charAt(j)==strs[i].charAt(j)){
                    fans+=ans.charAt(j);
                }else{
                    if(fans.length()==0){
                        return fans;
                    }
                    ans=fans;
                    break;
                }
            }ans=fans;
        }
        return ans;
    }
    public static void main(String[] args) {
        String []strs= {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
