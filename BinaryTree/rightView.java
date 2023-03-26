public class rightView {
    ArrayList<Integer> rightView(Node root) {
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
            ans.add(a.get(i).get(a.get(i).size()-1));
        }
        return ans;
    }
}
