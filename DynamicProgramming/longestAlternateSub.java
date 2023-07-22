public class longestAlternateSub {
    public int AlternatingaMaxLength(int[] arr)
    {
        if(arr.length<3){
            return arr.length;
        }
        int type=0;
        int count=2;
        if(arr[0]<arr[1]){
            type=1;
        }else if(arr[0]>arr[1]){
            type=0;
        }else{
            count=1;
        }
        for(int i=2;i<arr.length;i++){
            if(type==0 && arr[i-1]<arr[i]){
                count++;
                type=1;
            }else if(type==1 && arr[i-1]>arr[i]){
                count++;
                type=0;
            }
        }
        return count;
    }
}
