public class cntpalindrome {
    public static int countSubstrings(String s) {
        int ans=s.length();
        int m=-1;
        int n=-1;
        for(int i=1;i<s.length()-1;i++){
            if(i+1<=s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                m=i;
                n=i+1;
                while(m>=0 && n<s.length()){
                    if(s.charAt(m)==s.charAt(n)){
                        ans++;
                        if(m==0 || n==s.length()-1){
                            break;
                        }
                        else{
                            m--;
                            n++;
                        }
                        
                    }else{
                        m++;
                        n--;
                        break;
                    }
                    
                }
            }
            if(i-1>=0 && i+1<=s.length()-1 && s.charAt(i-1)==s.charAt(i+1)){
                m=i-1;
                n=i+1;
                while(m>=0 && n<s.length()){
                    if(s.charAt(m)==s.charAt(n)){
                        ans++;
                        if(m==0 || n==s.length()-1){
                            break;
                        }
                        else{
                            m--;
                            n++;
                        }
                    }else{
                        m++;
                        n--;
                        break;
                    }
                }
                
            }
            
        }
        if(s.length()>=2){
            if(s.charAt(0)==s.charAt(1)){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="aaaaa";
        System.out.println(countSubstrings(s));
    }
}
// public static int countSubstrings(String s) {
//     int ans=s.length();
//     if(s.length()==2){
//         if(s.charAt(0)==s.charAt(1)){
//             ans++;
//             return ans;
//         }else{
//             return ans;
//         }
//     }else if(s.length()==1){
//         return ans;
//     }
//     int m=-1;
//     int n=-1;
//     if(s.length()==3){
//         if((s.charAt(0)==s.charAt(1)) && (s.charAt(1)==s.charAt(2))){
//             ans+=3;
//         }
//         else if(s.charAt(0)==s.charAt(1)){
//         ans++;
//         }
//         else if(s.charAt(1)==s.charAt(2)){
//             ans++;
//         }else if(s.charAt(0)==s.charAt(2)){
//             ans++;
//         }
//            return ans;
        
//     }
//     for(int i=1;i<s.length()-1;i++){
//         if(s.charAt(i)==s.charAt(i+1)){
//             m=i;
//             n=i+1;
//             while(m>=0 && n<s.length()){
//                 if(s.charAt(m)==s.charAt(n)){
//                     ans++;
//                     if(m==0 || n==s.length()-1){
//                         break;
//                     }
//                     else{
//                         m--;
//                         n++;
//                     }
                    
//                 }else{
//                     m++;
//                     n--;
//                     break;
//                 }
                
//             }
//         }
//         if(s.charAt(i-1)==s.charAt(i+1)){
//             m=i-1;
//             n=i+1;
//             while(m>=0 && n<s.length()){
//                 if(s.charAt(m)==s.charAt(n)){
//                     ans++;
//                     if(m==0 || n==s.length()-1){
//                         break;
//                     }
//                     else{
//                         m--;
//                         n++;
//                     }
//                 }else{
//                     m++;
//                     n--;
//                     break;
//                 }
//             }
            
//         }
        
//     }return ans;
// }
