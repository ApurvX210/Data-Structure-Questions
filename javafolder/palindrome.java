public class palindrome {
    public static boolean isPalindrome(String s) {
        String ans="";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i)<='9')){
                ans+=s.charAt(i);
            }
        }
        System.out.println(ans);
        for(int i=0;i<ans.length()/2;i++){
            if(ans.charAt(i)!=ans.charAt(ans.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a="0P";
        System.out.println(isPalindrome(a));
    }
}
