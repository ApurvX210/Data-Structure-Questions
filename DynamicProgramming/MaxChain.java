public class MaxChain {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });
        int count=1;
        int num=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>num){
                count++;
                num=pairs[i][1];
            }
        }
        return count;
    }
}
