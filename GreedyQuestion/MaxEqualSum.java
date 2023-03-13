public class MaxEqualSum {
    public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) {
        int sum1=0;
        int sum2=0;
        int sum3=0;
        for(int i=0;i<S1.length;i++){
            sum1+=S1[i];
        }
        for(int i=0;i<S2.length;i++){
            sum2+=S2[i];
        }
        for(int i=0;i<S3.length;i++){
            sum3+=S3[i];
        }
        int p1=0;
        int p2=0;
        int p3=0;
        while(sum1!=sum2 && sum2!=sum3){
            if(p1==S1.length || p2==S2.length || p3==S3.length){
                return 0;
            }
            if(sum1>sum2 && sum1>sum3){
                sum1-=S1[p1];
                p1++;
            }else if(sum2>sum1 && sum2>sum3){
                sum2-=S2[p2];
                p2++;
            }else if(sum3>sum2 && sum1<sum3){
                sum3-=S3[p3];
                p3++;
            }
        }
        return sum1;
    }
}
