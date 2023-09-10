public class longestPalindrome {
    public static String longestPalindrome(String s) {
        
        String ans="";
        if(s.length()==0){
            return s;
        }else{
            ans=s.charAt(0)+"";
        }
        int m=-1;
        int n=-1;
        for(int i=1;i<s.length()-1;i++){
            if(i+1<=s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                m=i;
                n=i+1;
                while(m>=0 && n<s.length()){
                    if(s.charAt(m)==s.charAt(n)){
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
                if(ans.length()<(n-m+1) && (m>=0 && n<s.length())){
                    ans=s.substring(m, n+1);
                }
            }
            if(i-1>=0 && i+1<=s.length()-1 && s.charAt(i-1)==s.charAt(i+1)){
                m=i-1;
                n=i+1;
                while(m>=0 && n<s.length()){
                    if(s.charAt(m)==s.charAt(n)){
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
                if(ans.length()<(n-m+1) && (m>=0 && n<s.length())){
                    ans=s.substring(m, n+1);
                }
                
            }
            
        }
        if(s.length()>=2){
            if(s.charAt(0)==s.charAt(1)){
                if(ans.length()<2 ){
                    ans=s.substring(0,2);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="abb";
        System.out.println(longestPalindrome(s));
    }
}
// public static String longestPalindrome(String s) {
//     if(s.length()==1 || s.length()==0){
//         return s;
//     }else if(s.length()==2){
//         if(s.charAt(0)==s.charAt(1)){
//             return s;
//         }else{
//             return s.charAt(0)+"";
//         }
//     }
//     String ans="";
//     int m=-1;
//     int n=-1;
//     if(s.charAt(0)==s.charAt(1)){
//         ans=s.substring(0, 2);
//     }
//     if(s.charAt(1)==s.charAt(2)){
//         ans=s.substring(1, 3);
//     }
//     for(int i=1;i<s.length()-1;i++){
//         if(s.charAt(i)==s.charAt(i+1)){
//             m=i-1;
//             n=i+2;
//             while(m>=0 && n<s.length()){
//                 if(s.charAt(m)==s.charAt(n)){
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
//             if(ans.length()<(n-m+1) && (m>=0 && n<s.length())){
//                 ans=s.substring(m, n+1);
//             }
//         }
//         if(s.charAt(i-1)==s.charAt(i+1)){
//             m=i-1;
//             n=i+1;
//             while(m>=0 && n<s.length()){
//                 if(s.charAt(m)==s.charAt(n)){
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
//         if(ans.length()<(n-m+1) && (m>=0 && n<s.length())){
//             ans=s.substring(m, n+1);
//         }
//         // if(s.charAt(i-1)==s.charAt(i)){
//         //     m=i-1;
//         //     n=i;
//         //     if(ans.length()<(n-m+1) && (m>=0 && n<s.length())){
//         //     ans=s.substring(m, n+1);
//         // }else if(s.charAt(i)==s.charAt(i+1)){
//         //     m=i;
//         //     n=i+1;
//         //     if(ans.length()<(n-m+1) && (m>=0 && n<s.length())){
//         //     ans=s.substring(m, n+1);
//         //     }
//         // }
//         // }
//     }return ans;
// }