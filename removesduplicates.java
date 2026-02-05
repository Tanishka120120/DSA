import java.util.Stack;

public class removesduplicates {
    public static void main(String[] args) {
        String t="aabbaca";
        Stack <Character> s= new Stack<>();
        for( char c: t.toCharArray()){
            if(!s.isEmpty() && s.peek()==c){
                s.pop();
            }
            else{
                s.push(c);
            }
        }

        StringBuilder p= new StringBuilder();
        while(!s.isEmpty()){
            p.insert(0, s.pop());
        }
        System.out.println(p.toString());
    }
}
