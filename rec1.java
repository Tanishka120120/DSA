public class rec1 {
    static void rec(int n){
     if(n==0){
        return;
     }
     rec(n-1);
     //System.out.println(n);
    }
    static int fac(int n){
     if(n==1){
        return 1;
     }
     return n*fac(n-1);
    }
    public static void main() {
        rec(10);
        int i= fac(5);
        System.out.println(i);
    }
    
}
