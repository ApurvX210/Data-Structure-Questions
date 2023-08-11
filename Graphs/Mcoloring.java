public class Mcoloring {
    public boolean valid(boolean graph[][],int color,int num,int arr[]){
        for(int i=0;i<graph.length;i++){
            if(graph[num][i]){
                if(arr[i]==color){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean color(boolean graph[][],int arr[],int num,int m){
        if(num>graph.length-1){
            return true;
        }
        for(int i=0;i<m;i++){
            if(valid(graph, i+1, num, arr)){
                arr[num]=i+1;
                if(color(graph, arr, num+1,m)){
                    return true;
                }
                arr[num]=0;
            }
        }
        return false;
    }
    public boolean graphColoring(boolean graph[][], int m, int n) {
        int arr[]=new int[n];
        return color(graph, arr, 0,m);
    }
}
