public class ReverseBeforeIndex {

    public static String reverseBeforeIndex(String str, int index) {
        if (index < 0 || index >= str.length()) {
            return str; 
        }

        String part1 = str.substring(0, index + 1);
        
        // Part to keep as is: from index+1 to end
        String part2 = str.substring(index + 1);

        // Reverse part1
        String reversedPart1 = new StringBuilder(part1).reverse().toString();

        return reversedPart1 + part2;
    }

    public static void main(String[] args) {
        String input = "abcdefgh";
        int index = 4;

        String result = reverseBeforeIndex(input, index);
        System.out.println("Original String: " + input);
        System.out.println("After Partial Reverse: " + result);
    }
}