public class arr3 {
    public static void main(String[] args) {
        String A="hey";
        int n= A.length();
        int initial=0;
        int end=n-1;
        boolean flag=true;
        while(initial<=end){
            if(A.charAt(initial)!=A.charAt(end))
            {
                flag=false;
            }
            initial++;
            end--;
        }
        if(flag){
            System.out.println("string is a pailandrome");

        }
        else{
            System.out.println("not a pailandrome");
        }
    }
}
