public class bst {
    int data;
    bst left;
    bst right;
    bst(int data){
        this.data=data;
    }
    bst insert(bst root, int value){
        if(root==null){
            return new bst(value);
        }
        if(value<root.data){
            root.left=insert(root.left, value);
        }
        else if(value>root.data){
            root.right=insert(root.right,value);
        }
        return root;
    }
    boolean search(bst root, int ele){
    if(root==null){
        return false;
    }
    if(root.data==ele){
        return true;
    }
    if (ele<root.data) {
        return search(root.left, ele);
    }
    return search(root.right, ele);
}

bst findmin(bst root){
 while (root.left!=null) {
    root=root.left;

 }
 return root;
}

bst delete(bst root, int ele){
    if(root==null){
        return null;
    }
    if (ele<root.data) {
        root.left=delete(root.left, ele);
    }
    else if(ele>root.data){
        root.right=delete(root.right, ele);
    }
    else{
        if(root.left==null){
            return root.right;
        }
        if (root.right==null) {
            return root.left;
        }
        
            bst successor=findmin(root.right);
        root.data=successor.data;
        root.right=delete(root.right, successor.data);

    }
    return root;
}

    void display(bst root){
    if(root==null){
        return;
    }
 
    display(root.left);
    System.out.println(root.data);
    display(root.right);
    }
    public static void main(String[] args) {
        bst b= new bst(1);

        bst root = null;
        int[] arr={5,8,7,6,4,2,1,3,0,9};
        for(int i=0; i<10; i++){
            root=b.insert(root, arr[i]);
        }
        boolean k=b.search(root, 9);
        System.out.println(k);
        b.display(root);
        b.findmin(root);
        root=b.delete(root, 3);
        b.display(root);
    }

}
