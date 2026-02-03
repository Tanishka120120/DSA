class detectingcycleinll {
    /*1->2->3->4->5->2 */
static class node{
    int data;
    node next;
node(int d){
data=d;
}
}
static boolean hascycle(node head){
    node slow=head;
    node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            return true;
        }
        
    }
    return false;
}
public static void main(String[] args) {
    node head= new node(1);
    head.next=new node(2);
    head.next.next= new node(3);
    head.next.next.next=head.next;
    boolean h=hascycle(head);
    System.out.println(h);

}



}
