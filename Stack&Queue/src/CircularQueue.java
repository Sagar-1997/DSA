import java.util.ArrayList;

public class CircularQueue {
    private int size,front,rear;
    private int[]cir;
    CircularQueue(int size)
    {
        this.size=size;
        this.front=this.rear=-1;
        this.cir=new int[size];
    }
    //method to insert a new element in the queue
    public void enqueue(int data)
    {
        //check for list full condition
        if((rear+1)%size==front)
        {
            System.out.println("Queue is Empty ");
            return;
        }
        //empty queue
        if(front==-1)
        {
            front=0;
        }
        rear=(rear+1)%size;
        cir[rear]=data;
    }
    public void dequeue()
    {
        if(front==-1)
        {
            System.out.println("Queue is Empty");
            return;
        }
        int element = cir[front];
        System.out.println(element+" is deleted");
        if(front==rear)
        {
            front=rear=-1;
        }
        else
        {
            front=(front+1)%size;
        }
    }
    public void printQueue()
    {
        if(front==-1)
        {
            System.out.println("Queue is empty");
            return;
        }
        if(rear>=front)
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.print(cir[i]+" ");
            }
        }
        else
        {
            for(int i=front;i<size;i++)
            {
                System.out.print(cir[i]+" ");
            }
            for(int i=0;i<=rear;i++)
            {
                System.out.print(cir[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        CircularQueue c = new CircularQueue(3);
        c.enqueue(10);
        c.enqueue(8);
        c.dequeue();
        c.enqueue(85);
        c.printQueue();
        c.dequeue();
        c.printQueue();
        c.enqueue(7);
        c.printQueue();
    }
}
