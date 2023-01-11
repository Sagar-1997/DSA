import java.util.Stack;

public class SpecialStack extends Stack<Integer>{
    
    Stack<Integer> min = new Stack<Integer>();
    
    public void push(int item) {
        if(isEmpty())
        {
            super.push(item);
            min.push(item);
        }
        else
        {
            //int y=min.pop();
            super.push(item);
            //min.push(y);
            if(min.peek()>=item)
            {
                min.push(item);
            }
            // else
            // {
            //     min.push(y);
            // }
        }
    }
    public Integer pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        int popped=super.pop();
        if(min.peek()==popped)
        {
            min.pop();
        }
        return popped;
    }
    public Integer getMin()
    {
        int x=min.pop();
        min.push(x);
        return x;
    }
    public static void main(String[] args) {
        SpecialStack s=new SpecialStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.getMin());
        s.push(5);
        System.out.println(s.getMin());
    }
}
