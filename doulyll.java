public class doulyll {
    static class node {
    int data;
    node prev;
    node next;
    node(int data){
        this.data=data;
    }
    }
    node head;
    void insertatbegining(int data){
        node n= new node(data);
        if(head!=null){
            n.next=head;
            head.prev=n;

        }
        head=n;
    }
      void displayfwd(){
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
      }  

      void displaybk(){
        node temp=head;
        while(temp.next!=null){
        temp=temp.next;
        
        }
        while ((temp!=null)) {
            System.out.println(temp.data);
            temp=temp.prev;
        }
      }

      void insertatend(int data){
        node n=new node(data);
        if(head==null){
            head=n;
            return;
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=n;
        n.prev=temp;
    
      }
      //insert at particular index
      void insertatindex(int data, int index){
        if(index==0){
            insertatbegining(data);
        return; 
    }
    node n = new node (data);
    node temp= head;
    int count=0;
    while(temp!=null && count<index-1){
    temp=temp.next;
    count+=1;
    }
    n.next=temp.next;
    n.prev=temp;
    if(temp.next !=null){
        temp.next.prev=n;  
    }
    temp.next=n;
      }

    
    public static void main(String[] args){
      doulyll obj= new doulyll();
      obj.insertatbegining(3);
      obj.insertatbegining(2);
      obj.insertatbegining(1);

      obj.displayfwd();
      obj.insertatbegining(0);
      obj.displayfwd();
      obj.displaybk();

      obj.insertatend(8);
      obj.displayfwd(); 
      obj.insertatindex(4, 3);
      obj.displayfwd();
    }
}
