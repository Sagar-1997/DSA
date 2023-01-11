import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Stack<String> stack = new Stack<String>();
        stack.push("sagar");
        stack.push("hello");
        stack.push("geeks");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.search("sagar"));
        System.out.println(stack.empty());
        //Alternative of Stack collection
        //Deque<String> deque=new ArrayDeque<>();
    }
}
