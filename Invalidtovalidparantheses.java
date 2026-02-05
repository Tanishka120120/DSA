public class Invalidtovalidparantheses {
    public static void main(String[] args) {
        String s="())(";
        int open=0;
        int add=0;
        for( char c: s.toCharArray()){
            if(c=='('){
                open++;
            }
            else{
                if(open>0){
                    open--;
                }
                else{
                    add++;
                }
            }
        }

        System.out.println(add+open);
    }
}
