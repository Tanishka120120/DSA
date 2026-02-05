class queue {
    int[] arr;
    int rear;
    int capacity;
    queue(int size){
     capacity=size;
     arr=new int[size];
     rear-=1;
    }

    void enqueue(int x){
        if(rear==capacity-1){
            System.out.println("queue is full");
            return;
        }
        arr[++rear]=x;

    }

    void printqueue(){
        if(rear==-1){
            System.out.println("queue is empty");
            return;
        }
        for(int i=0; i<=rear; i++){
          System.out.println(arr[i]);
        }
    }

    int dequeue(){
        if(rear==-1){
            System.out.println("queue is empty");
            return -1;

        }

    int i= arr[0];
    for(int k=0; k<rear; k++){
        arr[k]= arr[k+1];

    }

    rear--;
    return i;
    }
    public static void main(String[] args) {
        queue isQueue= new queue(8);
        isQueue.enqueue(1);
        isQueue.enqueue(5);
        isQueue.enqueue(6);
        isQueue.printqueue();
       
        int h=isQueue.dequeue();
        System.out.println(h + "dequeue");
        isQueue.printqueue();
    }
}
