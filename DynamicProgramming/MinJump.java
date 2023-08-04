public class MinJump {
    static int minJumps(int[] arr){
        int step=arr[0];
        if(step==0){
            return -1;
        }
        int stock=step;
        int ans=1;
        for(int i=1;i<arr.length;i++){
            if(i==arr.length-1){
                return ans;
            }
            step-=1;
            stock-=1;
            if(stock<arr[i]){
                stock=arr[i];
            }
            if(step==0 && stock==0){
                return -1;
            }else if(step==0){
                step=stock;
                ans++;
                // System.out.println(arr[i]);
            }
            
        }
        return ans;
    }
}
