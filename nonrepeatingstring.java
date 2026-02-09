import java.util.LinkedList;
import java.util.Queue;
public class nonrepeatingstring {
    public static void main(String[] args) {
        String t="heyaabbcbdheycbbd";
        int[] freq= new int[100];
        Queue <Character> q= new LinkedList<>();
        for (char c: t.toCharArray()){
            freq[c-'a']++;


            q.offer(c);
            while (!q.isEmpty() && freq[q.peek()-'a']>1) {
                q.poll();
            }

            if(q.isEmpty()){
                System.out.println(-1);

            }

            else{
                System.out.println(q.peek());
            }
        }
        System.out.println(q);
    }
}
