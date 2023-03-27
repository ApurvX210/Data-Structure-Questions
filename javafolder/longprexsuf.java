import java.util.*;
public class longprexsuf {
    static int lps(String s) {
        int arr[]=new int[s.length()];
        if(arr.length==1){
            return 0;
        }
        int i=0;
        int j=1;
        while (j<s.length()) { 
            if(s.charAt(i)==s.charAt(j)){
                arr[j]=i+1;
                i++;
                j++;
            }else{
                if(i==0){
                    arr[j]=0;
                    j++;
                    continue;
                }
                i=arr[i-1];
                if(s.charAt(i)==s.charAt(j)){
                    arr[j]=i+1;
                    i++;
                    j++;
                }else{
                    arr[j]=0;
                    j++;
                }
            }
            
        }
        for(int m=0;m<s.length();m++){
            System.out.print(arr[m]+" ");
        }
        return arr[j-1];
    }
    public static void main(String[] args) {
        System.out.println(lps("acccbaaacccbaac"));
    }
    
}
