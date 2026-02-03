
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

static node deleteatbegining(node head){
    if(head==null){
        System.out.println("LL is empty");
    }
     head = head.next;
     return head;

}

static node deleteatending(node head){
node temp=head;
    while(temp.next.next!=null){
    temp=temp.next;
}
temp.next=null;
return head;
}

static node deleteatparticularindex(node head, int index){
    node temp=head;
    int count=0;
while(count < index-1 && temp.next!=null){
    temp=temp.next;
    count++;
}
temp.next=temp.next.next;
return head;
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



        head=deleteatbegining(head);
        System.out.println("deleting at beggining");
        node k= head;
        while(k!=null){
            System.out.println(k.data);
            k=k.next;
        }

        head=deleteatending(head);
        System.out.println("after deleting last node");
        node s= head;
        while(s!=null){
            System.out.println(s.data);
            s=s.next;
        }

        head=deleteatparticularindex(head, 1);
        System.out.println("after deleting at particular index");
        node b=head;
        while(b!=null){
            System.out.println(b.data);
            b=b.next;
        }
    }
    
}

