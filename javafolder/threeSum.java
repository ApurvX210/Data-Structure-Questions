import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        int a,b,c;
        int prev=Integer.MIN_VALUE;
        a=prev;
        Arrays.sort(nums);
        List<List<Integer>> lst=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                return lst;
            }
            if(nums[i]==0){
                if(nums.length-i>=3){
                    if(nums[i+1]==0 && nums[i+2]==0){
                        lst.add(Arrays.asList(0,0,0));
                    }
                }
                return lst;
            }
            if(i==0){
                a=nums[i];
                prev=a;
            }else if(prev!=nums[i]){
                a=nums[i];
                prev=a;
            }else{
                continue;
            }
            int sum=-a;
            int l=i+1;
            int h=nums.length-1;
            int back=Integer.MIN_VALUE;
            int back1=Integer.MIN_VALUE;
            while(l<h){
                if(nums[h]==back){
                        h--;
                        continue;
                    }
                    if(nums[l]==back1){
                        l++;
                        continue;
                    }
                int ap=nums[l]+nums[h];
                if(ap>sum){
                    back=nums[h];
                    h--;
                }else if(ap<sum){
                    back1=nums[l];
                    l++;
                }else{
                    lst.add(Arrays.asList(a,nums[l],nums[h]));
                    back=nums[h];
                    back1=nums[l];
                    // System.out.println(a+" "+nums[l]+" " +nums[h]);
                    h--;
                    l++;
                }
                
            }
        }
        return lst;
    }
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,4,1,3,0,3,-2,1,-2,2,-1,1,-5,4,-3};
        List<List<Integer>> lst=threeSum(arr);
        for( List<Integer> q: lst){
            for(int i : q){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
