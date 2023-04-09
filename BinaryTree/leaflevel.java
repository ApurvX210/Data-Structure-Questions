import java.util.LinkedList;
import java.util.Queue;

public class leaflevel {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    boolean leaf(Node root,int hieght,int maxh[]){
        if(root.left==null && root.right==null){
            if(maxh[0]!=-1){
                if(hieght!=maxh[0]){
                    return false;
                }
            }else{
                maxh[0]=hieght;
                return true;
            }
        }
        if(leaflevel(root.left, hieght+1, maxh) && leaflevel(root.right, hieght+1, maxh)){
            return true;
        }
        return false;
    }
    boolean check(Node root) {
        int maxh[]={-1};
        return leaf(root, 0, maxh);
        // Queue<Node> q=new LinkedList<>();
        // q.add(root);
        // int s=q.size();
        // int num=0;
        // boolean a=false;
        // while(q.size()>0){
        //     Node temp=q.poll();
        //     if(temp==null){
        //         break;
        //     }
        //     num++;
        //     if(a){
        //         if(temp.left!=null || temp.right!=null){
        //             return false;
        //         }
        //     }else{
        //         if(temp.left==null && temp.right==null){
        //             return false;
        //         }
        //     }
        //     if(temp.left!=null){
        //         q.add(temp.left);
        //     }
        //     if(temp.right!=null){
        //         q.add(temp.right);
        //     }
        //     if(num==s){
        //         num=0;
        //         Node t=q.peek();
        //         if(t==null){
        //             break;
        //          }
        //         if(t.left==null && t.right==null){
        //             a=true;
        //         }else{
        //             a=false;
        //         }
        //         s=q.size();
        //     }
        // }
        // return true;
    }
}
