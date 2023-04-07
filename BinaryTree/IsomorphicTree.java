public class IsomorphicTree {
    boolean isIsomorphic(Node p, Node q)  
    {
         if(p==null && q==null){
            return true;
        }
        if(p==null && q!=null){
            return false;
        }
        if(p!=null && q==null){
            return false;
        }
        if(p.data==q.data){
            if((isIsomorphic(p.left, q.right) && isIsomorphic(p.right, q.left)|| (isIsomorphic(p.right, q.right) && isIsomorphic(p.left, q.left)))){
                return true;
            }
        }
        return false;
    }
}
