class stack {
private int[] arr;
private int top;
private int capacity;
public stack(int size){
    capacity=size;
    arr=new int[capacity];
    top=-1;
}
public void push(int value){
if(isfull()){
    System.out.println("Stack is full");

}
arr[++top]=value;
}

public int pop(){
    if(isempty()){
        System.out.println("Stack is empty");
        return -1;
    }
    return arr[top--];
} 

public boolean isfull(){
    return top==capacity-1;
}
public boolean isempty(){
    return top==-1;
}
public void display(){
    if(isempty()){
        System.out.println("Stack is empty");
        return;
    }
    for(int i=top; i>=0; i--){
        System.out.println(arr[i]);
    }
}


    public static void main(String[] args) {
        stack obj= new stack(5);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.display();
        //obj.push(6);
        //obj.push(7);
        obj.pop();
        obj.display();
    }
}
