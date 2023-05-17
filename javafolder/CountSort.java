public class CountSort {
    public static String countSort(String arr)
    {
        int count[]=new int[26];
        for(int i=0;i<arr.length();i++){
            count[arr.charAt(i)-'a']++;
        }
        String ans="";
        for(int i=0;i<26;i++){
            if(count[i]!=0){
                ans+=((char)(i+'a')+"").repeat(count[i]);
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        char arr[] = { 'g', 'e', 'e', 'k', 's', 'f', 'o',
                       'r', 'g', 'e', 'e', 'k', 's' };
 
        // Function call
        System.out.println(countSort("edsab"));
    }
}
