public class StackImplLL {
    StackNode tail;
    StackNode head;
    static class StackNode
    {
        int data;
        StackNode next;
        StackNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public boolean isEmpty()
    {
        if(head==null)
        {
            return true;
        }
        return false;
    }
    public void push(int data)
    {
        if(head==null)
        {
            tail=new StackNode(data);
            head=tail;
        }
        else
        {
            StackNode newNode = new StackNode(data);
            tail.next=newNode;
            tail=tail.next;
            System.out.println(data+" is pushed is stack");
        }
    }
    public StackNode pop()
    {
        StackNode removeElm=null;
        if(isEmpty())
        {
            throw new RuntimeException("Stack is Empty");
        }
        else
        {
            StackNode newTail=head;
            while(newTail.next!=tail)
            {
                newTail = newTail.next;
            }
            removeElm=tail;
            tail=newTail;
            tail.next=null;
        }
        return removeElm;
    }
    public StackNode peek()
    {
        if(isEmpty())
        {
            throw new RuntimeException("Stack is empty");
        }
        return tail;
    }
    public void printLL()
    {
        StackNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        StackImplLL stack = new StackImplLL();
        //System.out.println(stack.isEmpty());
        stack.push(12);
        stack.push(30);
        stack.push(40);
        stack.push(100);
        stack.push(35);
        stack.push(92);
        System.out.println(stack.pop().data);
        System.out.println(stack.head.data+" "+stack.tail.data);
        stack.printLL();
    }
}
