import java.util.Stack;
public class bracketsstack {
     
    public static void main(){
        //String st = "{[()]()}";
        //String v="((())";
        String p="())(";
        String k="[({}){}([])]";
        Stack <Character> s=new Stack<>();
        for(char c:k.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                 s.push(c);

            }
        else{
            if(s.isEmpty()){
                System.out.println("false");
                return;
            }
            char g=s.pop();
             if((c==')' && g!='(') || (c==']' && g!='[') || (c=='}' && g!='{')){
               System.out.println("false");
               return;
            }
        
        }
    }

        
        /*if (s.isEmpty()){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }*/
        System.out.println(s.isEmpty() ? "True" : "False");
        
    }
}
