//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    
    // Complete the function
    // str: input string
    public static StringBuffer reverseWord(String str)
    {
		StringBuffer s=new StringBuffer(str);
        for(int i=0;i<str.length()/2;i++){
           char a=str.charAt(i);
		   s.setCharAt(i, s.charAt(str.length()-i-1));
		   s.setCharAt(str.length()-i-1, a);

		}
		return s;
        // Reverse the string str
    }
}