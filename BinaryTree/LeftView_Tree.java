import java.util.ArrayList;

public class LeftView_Tree {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Node> q= new LinkedList<>();
        List<List<Integer>> a=new ArrayList<>();
        q.add(root);
        int s=q.size();
        int num=0;
        List<Integer> l=new ArrayList<>();
        while(q.size()>0){
            Node temp=q.remove();
            if(temp==null){
                break;
            }
            l.add(temp.data);
            num++;
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
            if(num==s){
                num=0;
                a.add(new ArrayList<>(l));
                l.clear();
                s=q.size();
            }
            
        }
        for(int i=0;i<a.size();i++){
            ans.add(a.get(i).get(0));
        }
        return ans;
    }
}
