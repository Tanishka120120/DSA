import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reversequeueusingstack {
    
    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        // Step 1: Push all elements from queue to stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Step 2: Pop from stack and put back into queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("Original Queue" + queue);

        // Reverse the queue
        reverseQueue(queue);

        System.out.println("Reversed Queue" + queue);
    }
}

