import java.util.HashMap;

public class DuplicateSubtree {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public String duplicate(Node root,HashMap<String,Integer> h){
        if(root==null){
            return "";
        }
        if(root.left==null && root.right==null){
            return root.data+"";
        }
        String a=duplicate(root.left, h);
        String b=duplicate(root.right, h);
        if(h.containsKey(root.data+" "+a+" "+b)){
            h.put(root.data+" "+a+" "+b, h.get(root.data+" "+a+" "+b)+1);
        }else{
            h.put(root.data+" "+a+" "+b,1);
        }
        return root.data+" "+a+" "+b;
    }

    int dupSub(Node root) {
        HashMap<String,Integer> h=new HashMap<>();
        duplicate(root, h);
        // for(String i:h.keySet()){
        //     System.out.println(i+" "+h.get(i));
        // }
        for(String i:h.keySet()){
            if(h.get(i)>1){
                return 1;
            }
        }
        return 0;
    }
}
