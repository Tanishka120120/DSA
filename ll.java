
public class ll {
static class node{ 
    int data; 
    node next;
    node (int data){
        this.data=data;
        this.next=null;
    }
}
static node add_begining(int value, node h){
    node n= new node(value);
    n.next=h;
    return n;
}
    public static void main(String[] args) {
        node head= new node(1);
        head.next= new node(2);
        head.next.next= new node(3);
        node temp= head;
        while(temp!= null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        head=add_begining(0, head);
        node t= head;
        while(t!=null){
            System.out.println(t.data);
            t=t.next;
        }
        
    }
    
}
//add at particular index
