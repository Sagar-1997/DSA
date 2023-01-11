public class QueueImplLL {
    QueueNode front;
    QueueNode rear;
    
    static class QueueNode{
        int data;
        QueueNode next;
        QueueNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    QueueImplLL()
    {
        front=null;
        rear=null;
    }
    public boolean isEmpty()
    {
        if(front==null && rear==null)
        {
            return true;
        }
        return false;
    }
    public void enqueue(int data)
    {
        if(isEmpty())
        {
            rear=new QueueNode(data);
            front=rear;
            return;
        }
        QueueNode newItem=new QueueNode(data);
        rear.next=newItem;
        rear=rear.next;
    }
    public void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty!!");
            return;
        }
        System.out.println(front.data+" deleted from Queue");
        QueueNode temp=front;
        front=front.next;
        temp.next=null;
    }
    public void printQueue()
    {
        QueueNode temp=front;
        System.out.println("********************************");
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        System.out.println("**********************************");
    }
    public static void main(String[] args) {
        QueueImplLL q=new QueueImplLL();
        System.out.println(q.isEmpty()); 
        q.enqueue(10);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(100);
        q.printQueue();   
        q.dequeue();
        q.printQueue();
        System.out.println("front : "+q.front.data);
        System.out.println("rear : "+q.rear.data); 
        q.dequeue();
        System.out.println("front : "+q.front.data);
        System.out.println("rear : "+q.rear.data);
        q.enqueue(34);
        q.printQueue();   
        System.out.println("front : "+q.front.data);
        System.out.println("rear : "+q.rear.data);
    }
}
