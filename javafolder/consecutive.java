public class consecutive {
    public static String removeConsecutiveCharacter(String S){
        StringBuffer s=new StringBuffer(S);
        int num=0;
        int size=s.length();
        for(int i=1;i<size;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                s.deleteCharAt(i);
                i--;
                size--;
            }
        }
        S=s.toString();
        return S;
    }
    public static void main(String[] args) {
        String s="aabaa";
        System.out.println(removeConsecutiveCharacter(s));
    }
}
