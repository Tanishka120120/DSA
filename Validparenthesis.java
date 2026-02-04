import java.util.Stack;

public class Validparenthesis {
    public static void main(String[] args) {

        String s = "{[()]}";
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                st.push(c);

            } else if (c == ')' || c == '}' || c == ']') {

                if (st.isEmpty()) {
                    System.out.println("False");
                    return;
                }

                char top = st.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    System.out.println("False");
                    return;
                }
            }
        }

        System.out.println(st.isEmpty() ? "True" : "False");
    }
}
