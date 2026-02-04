import java.util.Stack;
public class stackgreaterele {
    
    public static void main(String[] args) {
        
    int[] arr={4,2,5,10,8};
    Stack <Integer> s= new Stack<>();
    int n= arr.length;
    
    int[] top=new int[n];
    for(int i=n-1; i>=0;i--){
      while(!s.isEmpty() && s.peek()<arr[i]){
         s.pop();

      }
      top[i]=s.isEmpty()?-1:s.peek();
    s.push(arr[i]);
    }

    for(int k=0;k<n;k++){
        System.out.println(top[k]);
    }
}
}
