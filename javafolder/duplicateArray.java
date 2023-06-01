import java.util.*;
public class duplicateArray {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
          if(arr[i]!=i && arr[i]!=-1 && arr[i]!=-2){
              int num=i;
                while(arr[num]!=-1 && arr[num]!=-2 && arr[num]!=num && arr[arr[num]]!=-1 ){
                  if(arr[num]==arr[arr[num]]){
                    a.add(arr[num]);
                    arr[arr[num]]=-1;
                    arr[num]=-2;
                    break;
                  }
                  int x=arr[arr[num]];
                  arr[arr[num]]=arr[num];
                  arr[i]=x;
                }
            }
        }
        if(a.size()==0){
          a.add(-1);
        }
        Collections.sort(a);
        return a;
    }
    public static void main(String[] args)
  {
    int numRay[] = {16, 7, 5 ,23, 5, 18, 23 ,15, 5, 13 ,18, 10, 22 ,5 ,17, 14, 5 ,3 ,15, 5,12 ,11, 15, 16 ,9, 4 ,15};
    int n = numRay.length;
    ArrayList<Integer> ans = duplicates(numRay, n);
    for (Integer i : ans) {
      System.out.println(i);
    }
  }
}
// if(arr[i]!=i && arr[i]!=-1){
//   int num=i;
//     while(arr[num]!=-1 && arr[num]==arr[arr[num]]){
      
//     }
// }
// int x=arr[arr[i]];
//                 arr[arr[i]]=arr[i];
//                 arr[i]=x;