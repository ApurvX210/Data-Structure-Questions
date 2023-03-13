import com.mysql.cj.conf.ConnectionUrlParser.Pair;

public class Maxlengthchain {
    int maxChainLength(Pair arr[], int n)
    {
       Arrays.sort(arr, new Comparator<Pair>() {

            @Override
            public int compare(Pair o1, Pair o2) {
                // if(o1.deadline==o2.deadline){
                    return (o1.x-o2.x);
                
                // return (o1.deadline-o2.deadline);
            }
            
        });
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].x +" "+arr[i].y);
        }
        int ans=1;
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i].x>arr[i-1].y){
                count++;
                ans=Integer.max(ans, count);
            }else{
                count=1;
            }
        }
        return ans;
    }
}
