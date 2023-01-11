import java.util.Arrays;

class Stack1{
    public static final int MAX_CAPACITY=100;
    private int top=-1;
    private int []stack;
    Stack1(){
        stack = new int[MAX_CAPACITY];
    }
    Stack1(int capacity)
    {
        stack = new int[capacity];
    }
    public boolean isEmpty()
    {
        if(top<0)
        {
            return true;
        }
        return false;
    }
    public int size()
    {
        if(isEmpty())
        {
            return 0;
        }
        return top+1;
    }
    public void push(int data)
    {
        if(top>=stack.length-1)
        {
            int size = 2*stack.length;
            int []stack1=new int[size];
            stack1 = Arrays.copyOf(stack, size);
            stack=stack1;
        }
        top++;
        stack[top]=data;
    }
    public int pop()
    {
        if(isEmpty())
        {
            throw new RuntimeException("Stack is Empty");
        }
        int element = stack[top];
        top--;
        return element;
    }
    public int peek()
    {
        if(isEmpty())
        {
            throw new RuntimeException("Stack is Empty");
        }
        return stack[top];
    }
    public void print()
    {
        int i=0;
        while(i<=top)
        {
            System.out.print(stack[i]+" ");
            i++;
        }
    }
}
public class StackImpArray{

    public static void main(String[] args) {
        Stack1 st = new Stack1();
        st.push(20);
        st.push(30);
        st.push(200);
        st.push(37);
        st.push(36);
        st.push(90);
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        st.print();
    }
}