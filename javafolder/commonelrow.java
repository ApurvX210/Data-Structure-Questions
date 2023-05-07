import java.util.Hashtable;

public class commonelrow {
    // public static boolean binarysearch(int arr[],int num){
    //     int l=0;
    //     int h=arr.length-1;
    //     while(l<=h){
    //         int mid=(l+h)/2;
    //         if(arr[mid]>num){
    //             h=mid-1;
    //         }else if(arr[mid]<num){
    //             l=mid+1;
    //         }else{
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    public static int common(int[][] matrix){
        Hashtable<Integer,Integer> h=new Hashtable<>();
        for(int i=0;i<matrix[0].length;i++){
            h.put(matrix[0][i], 1);
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(h.containsKey(matrix[i][j])){
                    int val=h.get(matrix[i][j]);
                    h.put(matrix[i][j], val+1);
                }
            }
        }
        for(int i:h.keySet()){
            if(h.get(i)==matrix.length){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int mat[][] = {{1, 2, 3, 4, 5}, 
        {2, 4, 5, 8, 10}, 
        {3, 5, 7, 9, 11}, 
        {1, 3, 5, 7, 9}};
        int result = common(mat);
        if (result == -1)
            System.out.print("No common element");
        else
            System.out.print("Common element is " + result);
    }
}
