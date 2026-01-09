//max non repeating subarray
import java.util.HashMap;
public class hm {
    public static void main( String[] args){
    String s="abcabcbb";
    HashMap <Character, Integer> h= new HashMap<>();
    int start=0;
    int max_len=0;
    for(int i=0; i<s.length(); i++){
    char c=s.charAt(i);
    if(h.containsKey(c) && h.get(c)>=start){
    start=h.get(c)+1;
    }
    h.put(c, i);
    max_len=Math.max(max_len, i-start+1);
    }    
    System.out.println(max_len);
}
    
}
