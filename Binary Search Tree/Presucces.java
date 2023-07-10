public class Presucces {
    public static void findPreSuc(Node root, int key)
{
    // code here.
    
    /* There are two static nodes defined above pre(representing predecessor) and suc(representing successor) as follows:
       static Node pre=null,suc=null
       You need to update these both.
       And the data inside these classes will be printed automatically by the driver code. 
    */
    if(root==null){
        return;
    }
    findPreSuc(root.left, key);
    if(root.data<key){
        if(pre!=null){
            if(pre.data<root.data){
                pre=root;
            }
        }else{
            pre=root;
        }
    }
    if(root.data>key){
        if(suc==null){
            suc=root;
        }
    }
    findPreSuc(root.right, key);
}
}
