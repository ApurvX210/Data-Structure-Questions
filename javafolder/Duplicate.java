import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
class Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Hashtable<Integer, Integer> d = new Hashtable<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(d.containsKey(nums[i])){
                int val=d.get(nums[i])+1;
                d.put(nums[i], val);
            }else{
                d.put(nums[i], 1);
            }
        } 
        System.out.println(d);
        boolean flag=false;
        for(int num:d.keySet()){
            int v=d.get(num);
            if((d.get(num))>1){
                flag=true;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1};
        Duplicate s=new Duplicate();
        System.out.println(s.containsDuplicate(arr));
        
    }
}
