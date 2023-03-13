public class smallestNum {
    static String smallestNumber(int S, int D){
        int ans=0;
        int num=9;
        int j=0;
        for(int i=0;i<D;i++){
            if(i==D-1){
                ans+=num*(10^j);
                break;
            }
            if(S-num>=(D-i)){
                ans+=num*(10^j);
                j++;
                S-=num;
            }else{
                num=D-i;
            }
        }
        return ans;
    }
}
