public class ClimbStairs {
    public int climbStairs(int n) {
        int[] table = new int[n+1];
        table[0] = 1;
        for (int i = 1; i <= n; i++){
            table[i] += table[i - 1];
            if(i-2>=0){
                table[i] += table[i - 2];
            }
        }
        return table[n];
    }
}
