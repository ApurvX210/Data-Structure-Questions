class Solution {
    public static int characterReplacement(String s, int k) {
        int ans=0;
        Character c=s.charAt(0);
        int t=k;
        int val=1;
        int nextTarget=-1;
        int prevTarget=0;
        int i=1;
        int arr[]=new int[26];
        while(i<s.length()){
            arr[s.charAt(i)-'A']++;
            if(s.charAt(i)==c){
                val++;
            }else{
                if(t==k){
                    nextTarget=i;
                }
                t--;
                if(t>=0){
                    val++;
                }
                if(t==-1){
                    for(int j=prevTarget;j<nextTarget;j++){
                        arr[s.charAt(j)-'A']--;
                    }
                    int num=i-nextTarget+1-arr[s.charAt(nextTarget)-'A'];
                    t=k-num;
                    val=i-nextTarget+1;
                    c=s.charAt(nextTarget);
                }
            }
            ans=Integer.max(ans,val);
            i++;
        }
        
        if(t>0){
            ans=Integer.max(ans,Integer.min(val+t,s.length()));
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 1));
        String s="ascs";
        s.substring()
    }
}