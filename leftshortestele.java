import java.util.Stack;
public class leftshortestele {
    public static void main(String[] args) {
        int[] arr={4,2,5,8,10,7};
        int n= arr.length;
        int[] top= new int[n];
        Stack <Integer> s= new Stack<>();
        
        for(int i=0; i<n; i++){
            while(!s.isEmpty() && s.peek()>=arr[i]){
             s.pop();
            }

            if(s.isEmpty()){
                top[i]=-1;
            }
            else{
                top[i]=s.peek();
            }

            s.push(arr[i]);
        }

        for(int i=0;i<n;i++){
            System.out.println(top[i]);
        }

    }
}
