public class Hieght {
    int height(Node node) 
    {
        if(node==null){
            return 0;
        }
        return Integer.max(height(node.left)+1, height(node.right)+1);
    }
}
