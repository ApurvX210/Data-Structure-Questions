public class FractionalNapsack {
    class Item {
        int value, weight;
        Item(int x, int y){
            this.value = x;
            this.weight = y;
        }
    }
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        Arrays.sort(arr, new Comparator<Item>(){
            @Override
            public int compare(Item o1,Item o2){
                double a2=(double)o2.value/(double)o2.weight;
                double a1=(double)o1.value/(double)o1.weight;
                
                if(a2-a1>0){
                    return 1;
                }else{
                    return -1;
                }
                // return ((o2.value/o2.weight)-(o1.value/o1.weight));
            }
        });
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i].value);
        // }
        double profit=0;
        for(int i=0;i<arr.length;i++){
            if(W-arr[i].weight>=0){
                profit+=arr[i].value;
                W-=arr[i].weight;
            }else{
                if(W==0){
                    break;
                }
                double x=(double)arr[i].value;
                double y=(double)arr[i].weight;
                double s=x/y;
                profit+=W*s;
                W=0;
            }
        }
        return profit;
    }
    
}
