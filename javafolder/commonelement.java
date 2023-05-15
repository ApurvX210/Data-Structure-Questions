import java.util.ArrayList;
import java.util.List;

public class commonelement {
    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        int arr[]=new int[3];
        arr[0]=0;
        arr[1]=0;
        arr[2]=0;
        ArrayList<Integer> l=new ArrayList<>();
        while(arr[0]<n1 && arr[1]<n2 && arr[2]<n3){
            if(A[arr[0]]==B[arr[1]] && B[arr[1]]==C[arr[2]]){
                if (A[arr[0]] == B[arr[1]] && B[arr[1]] == C[arr[2]]){
                    if(l.size()==0 || l.get(l.size()-1)!=A[arr[0]]){
                        l.add(A[arr[0]]);
                    }
                    
                    arr[0]+=1;
                    arr[1]+=1;
                    arr[2]+=1;
                }
                
                
            }
            else if(A[arr[0]]>=B[arr[1]] && A[arr[0]]>=C[arr[2]]){
                if(A[arr[0]]!=B[arr[1]]){
                    arr[1]++;
                }
                if(A[arr[0]]!=C[arr[2]]){
                    arr[2]++;
                }
            }else if(B[arr[1]]>=A[arr[0]] && B[arr[1]]>=C[arr[2]]){
                if(B[arr[1]]!=A[arr[0]]){
                    arr[0]++;
                }
                if(B[arr[1]]!=C[arr[2]]){
                    arr[2]++;
                }
            }else if(C[arr[2]]>=A[arr[0]] && C[arr[2]]>=B[arr[1]]){
                if(C[arr[2]]!=A[arr[0]]){
                    arr[0]++;
                }
                if(C[arr[2]]!=B[arr[1]]){
                    arr[1]++;
                }
            }
        }
        return l;
        
    }public static void main(String args[])
    {
        int ar1[] = { 1, 5, 10, 20, 40, 80 };
        int ar2[] = { 6, 7, 20, 80, 100 };
        int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
 
        System.out.print(commonElements(ar1, ar2, ar3 ,ar1.length,ar2.length,ar3.length));
        
    }
}
