//reverse the string with recurssion
import java.util.Arrays;
public class rec2 {
    static void rec(char[] a, int i, int j){
    if(i>=j){
        return;
    }
    char temp=a[i];
    a[i]=a[j];
    a[j]=temp;
    rec(a, i+1, j-1);
    
    }
    public static void main(String[] args) {
        String s="heythere";
        char [] arr=s.toCharArray();
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        rec(arr,0,s.length()-1);
        String n=new String(arr);
        System.out.println(n);
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
