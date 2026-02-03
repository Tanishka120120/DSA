
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

static void add_at_index(int value, node h, int i){
    node n= new node(value);
    node temp=h;
    int x=0;
    while(temp!= null && x<i){
     temp=temp.next;
     x++;
    }
    
    n.next=temp.next;
    temp.next=n;
 
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
        System.out.println("node added at the begining");
        while(t!=null){
            System.out.println(t.data);
            t=t.next;
        }
        add_at_index(8,head,2);
        node p=head;
        System.out.println("node added at particular index");
        while(p!=null){
            System.out.println(p.data);
            p=p.next;
        }
        //reverse
        node prev=null;
        node curr=head;

        while(curr!=null){
            node nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        head=prev;
    node j= head;
    System.out.println("reverse");
    while(j!=null){
            System.out.println(j.data);
            j=j.next;
        }
    }
    
}

