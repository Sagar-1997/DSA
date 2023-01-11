import java.util.Stack;

public class ImplQeueFromStack {
    public static void enqueue(Stack<Integer> stack1,int data)
    {
        stack1.push(data);
    }
    public static void dequeue(Stack<Integer> stack1,Stack<Integer> stack2)
    {
        while(!stack1.isEmpty())
        {
            stack2.push(stack1.pop());
        }
        System.out.println(stack2.pop()+" is popped");
        while(!stack2.isEmpty())
        {
            stack1.push(stack2.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        enqueue(stack1, 10);
        enqueue(stack1, 20);
        enqueue(stack1, 30);
        System.out.println(stack1);
        dequeue(stack1, stack2);
        System.out.println(stack1);
    }
}
