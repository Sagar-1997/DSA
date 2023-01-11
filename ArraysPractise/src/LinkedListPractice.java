public class LinkedListPractice {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            this.data=d;
            this.next=null;
        }
    }
    public void insertEnd(int d)
    {
        if(head==null)
        {
            head=new Node(d);
        }
        else
        {
            Node temp=new Node(d);
            Node tail=head;
            while(tail.next!=null)
            {
                tail=tail.next;
            }
            tail.next=temp;
        }
    }
    public void printList()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public Node reverseKthGroup(Node head,int k)
    {
        if(head==null)
        {
            return head;
        }
        Node prev=null;
        Node forward=null;
        Node curr=head;
        int cnt=0;
        while(curr!=null&&cnt<k)
        {
            forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
            cnt++;
        }
        if(forward!=null)
        {
            head.next=reverseKthGroup(forward, k);
        }
        return prev;
    }
    public Node reverse(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node ch=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return ch;
    }
    void checkforcirularList()
    {
        if(head==null)
        {
            System.out.println(true);
        }
        else
        {
            Node temp=head.next;
            while(temp!=null && temp!=head)
            {
                temp=temp.next;
            }
            if(temp==null)
            {
                System.out.println(false);
            }
            if(temp==head)
            {
                System.out.println(true);
            }
        }
    }
    public static void main(String[] args) {
        LinkedListPractice lp= new LinkedListPractice();
        lp.insertEnd(3);
        lp.insertEnd(7);
        lp.insertEnd(15);
        lp.insertEnd(30);
        //lp.printList();
        //lp.head=lp.reverseKthGroup(lp.head,2);
        //lp.head=lp.reverse(lp.head);
        lp.checkforcirularList(); 
        lp.printList();
    }
}
