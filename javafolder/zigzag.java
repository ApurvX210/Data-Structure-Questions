public class zigzag {
    static void zig(int arr[][],int n,int m){
        int i=0;
        int j;
        while(i<n){
            int x=i;
            j=0;
            while(j<=i && j<m){
                System.out.print(arr[x][j]+" ");
                x--;
                j++;
            }
            System.out.println();
            i++;
        }
        i=n-1;
        j=1;
        while(j<m){
            int x=j;
            int q=i;
            while(x<m){
                System.out.print(arr[q][x] +" ");
                x++;
                q--;
            }
            System.out.println();
            j++;
        }

    }public static void main(String[] args)
    {
        int M[][] = {{ 1, 2, 3,4},{5, 6,7,8},{9,10,11,12}};
        zig(M,3,4);
    }
}
