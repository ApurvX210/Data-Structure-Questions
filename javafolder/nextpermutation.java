import java.util.Arrays;

public class nextpermutation {
    public static void nextPermutation(int[] arr) {
        if(arr.length==1){
           System.out.print(arr[0]);
            return;
        }
        int b=-1;
        int fb=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<=arr[i-1]){
                if(b==-1){
                    fb=i-1;
                }
                b=i;
            }
        }
        if(b<=arr.length-2){
            int num=arr[arr.length-2];
            arr[arr.length-2]=arr[arr.length-1];
            arr[arr.length-1]=num;
        }
        boolean flag=true;
        if(b==arr.length-1){
            int num=-1;
            for(int i=1;i<arr.length;i++){
                if(arr[i]>arr[i-1]){
                    num=i;
                    flag=false;
                }
            }
            if(flag){
                for(int i=0;i<arr.length/2;i++){
                    int a=arr[i];
                    arr[i]=arr[arr.length-1-i];
                    arr[arr.length-1-i]=a;
                }
            }else{
                int t=-1;
                for(int i=0;i<arr.length-num;i++){
                    if(arr[num]>=arr[num+i] && arr[num-1]<arr[num+i]){
                        t=num+i;
                    }
                }
                int a=arr[num-1];
                        arr[num-1]=arr[t];
                        arr[t]=a;
                
                int arr1[]=new int[arr.length-num];
                for(int i=0;i<arr1.length;i++){
                    arr1[i]=arr[num+i];
                }
                Arrays.sort(arr1);
                for(int i=0;i<arr1.length;i++){
                    arr[num+i]=arr1[i];
                }
            }
        
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    }
    public static void main(String[] args) {
        int arr[]={1,3,2};
        nextPermutation(arr);
    }
}
