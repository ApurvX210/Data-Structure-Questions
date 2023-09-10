public class celibrityProblem {
    int celebrity(int M[][], int n)
    {
        int c=0;
    	for(int i=0;i<n;i++){
            if(c!=0){
                if(M[0][i]==1){
                    if(M[c][i]==1 && M[i][c]==0){
                        c=i;
                    }else if(M[c][i]==1 && M[i][c]==1){
                        c=0;
                    }
                }
            }else if(c==0){
                if(M[0][i]==1){
                    c=i;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(M[c][i]==1){
                c=-1;
                break;
            }
        }
        if(c!=-1){
            for(int i=0;i<n;i++){
                if(M[i][c]==0 && i!=c){
                    c=-1;
                    break;
                }
            }
        }
        return c;
    }
}
