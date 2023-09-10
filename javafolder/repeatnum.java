public class repeatnum {
    public static int[] repeatedNumber(int[] arr) {
        int count[]=new int[arr.length+1];
        count[0]=-1;
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int a=0;
        int b=0;
        for(int i=1;i<arr.length+1;i++){
            if(count[i]==0){
                b=i;
            }else if(count[i]==2){
                a=i;
            }
        }
        int arr1[]={a,b};
        return arr1;
    }
    public static void main(String[] args) {
        int arr[]={3,4,1,1};
        int ans[]=repeatedNumber(arr);
        System.out.println("A:"+ans[0]+" B:"+ans[1]);
    }
}
