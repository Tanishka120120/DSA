import java.util.LinkedList;
import java.util.Queue; 
class trees {
    int data;
    trees left;
    trees right;

    trees(int data){
        this.data=data;
        right=null;
        left=null;
        
    }
    //left-> root->right
    void inorder(trees root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    //root->left->right
    void preorder(trees root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    //left->right->root
    void postorder(trees root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    void levelorder(trees root){
    Queue <trees> q= new LinkedList<>();
    q.offer(root);
    while (!q.isEmpty()) {
        trees n= q.poll();
        System.out.println(n.data);
        if(n.left!=null) {
            q.offer(n.left);
        }
        if (n.right!=null) {
            q.offer(n.right);
        }
    }
    }
    //height of tree
     int height(trees root){
        if(root==null){
            return 0;
        }
        int left= height(root.left);
        int right = height(root.right);
        return Math.max(left, right)+1;
    }
    //no. of nodes
    int count_nodes(trees root){
         if(root==null){
            return 0;
         }
         return 1+count_nodes(root.left)+ count_nodes(root.right);
    }

    int sum_nodes(trees root){
        if(root==null){
            return 0;
        }
        return root.data+ sum_nodes(root.left)+ sum_nodes(root.right);
    }
    public static void main(String[] args) {
        trees root= new trees(1);
        root.left=new trees(2);
        root.right= new trees(3);
        root.left.right= new trees(4);
        root.right.left=new trees(5);
        root.right.left.left= new trees(6);
        System.out.println("inorder");
        root.inorder(root);
        System.out.println("preorder");
        root.preorder(root);
        System.out.println("postorder");
        root.postorder(root);
        System.out.println("levelorder");
        root.levelorder(root);
        System.out.println("height");
       int y= root.height(root);
       System.out.println(y);
       System.out.println("count no of nodes");
       int x= root.count_nodes(root);
       System.out.println(x);
       System.out.println("sum no of nodes");
       int p= root.sum_nodes(root);
       System.out.println(p);
    }
}
