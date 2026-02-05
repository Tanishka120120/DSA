import java.util.Stack;
public class temp {
    public static void main(String[] args){
        int[] arr={37, 45, 38, 45, 42,56};
        int n= arr.length;
        int[] warm= new int[n];
        int count=0;
        Stack <Integer> s= new Stack <> ();
        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                warm[i]=0;
            }
            else{
                warm[i]= s.peek()-i;
                
            }
            s.push(i);
        }
        for(int i = 0; i < n; i++){
            System.out.print(warm[i] + " ");
        }

        
    } 
}


