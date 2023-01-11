public class QueueImplArrary {
    public static final int MAX_CAPACITY=100;
    int []Queue;
    int front;
    int rear;
    int size;
    QueueImplArrary()
    {
        Queue = new int[MAX_CAPACITY];
        front=0;
        rear=-1;
        size=MAX_CAPACITY;
    }
    QueueImplArrary(int capacity)
    {
        Queue = new int[capacity];
        front=0;
        rear=-1;
        size=capacity;
    }
    public boolean isEmpty()
    {
        if(front == rear+1)
        {
            return true;        
        }
        return false;
    }
    public int front()
    {
        if(isEmpty())
        {
            System.out.println("Empty Queue");
            return -1;
        }
        return Queue[front];
    }
    public int rear()
    {
        if(isEmpty())
        {
            System.out.println("Empty Queue");
            return -1;
        }
        return Queue[rear];
    }
    public boolean isFull()
    {
        if(rear==size-1)
        {
            return true;
        }
        return false;
    }
    public void Enqueue(int data)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        Queue[++rear]=data;
    }
    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        int p=Queue[front];
        front++;
        return p;
    }
    public void printQueue()
    {
        System.out.println("*******************************");
        for(int i=front;i<=rear;i++)
        {
            System.out.print(Queue[i]+" ");
        }
        System.out.println();
        System.out.println("*******************************");
    }
    public static void main(String[] args) {
        QueueImplArrary q=new QueueImplArrary(10);
        // System.out.println(q.isEmpty());
        // System.out.println(q.isFull());
        // System.out.println(q.front());
        // System.out.println(q.rear());
        q.Enqueue(20);
        q.Enqueue(100);
        q.Enqueue(30);
        q.Enqueue(56);
        q.printQueue();
        System.out.println("Front : "+q.front());
        System.out.println("Rear : "+q.rear());
        q.Enqueue(90);
        q.printQueue();
        System.out.println("New Rear : "+q.rear());
        System.out.println(q.dequeue()+" removed from queue");
        q.printQueue();
        System.out.println("New Front : "+q.front());
    }
}
