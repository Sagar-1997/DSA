class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class PalidromeInLL {
    Node head;

    public void insertAtTail(int data)
    {
        if(head==null)
        {
            head = new Node(data);
        }
        else
        {
            Node newNode= new Node(data);
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
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
    public Boolean checkPalidrome()
    {
        int len=0;
        Node temp=head;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        int arr[] = new int[len];
        int i=0;
        temp=head;
        while(i<len)
        {
            arr[i]=temp.data;
            i++;
            temp=temp.next;
        }
        boolean flag=false;
        for( i=0;i<len/2;i++)
        {
            if(arr[i]==arr[len-1-i])
            {
                flag=true;
            }
            else{
                flag=false;
                break;
            }
        }
        return flag;
    }
    public int PalidromeWithoutExtraSpace()
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
           slow=slow.next;
           fast=fast.next.next;
        }
        slow.next=reverse(slow.next);
        Node temp = head;
        Node temp1=slow.next;
        while(temp1!=null)
        {
            if(temp.data!=temp1.data)
            {
                return 0;
            }
            temp1=temp1.next;
            temp=temp.next;
        }
        slow.next=reverse(slow.next);
        return 1;
    }
    public Node reverse(Node h)
    {
        Node prev=null;
        Node next=null;
        Node curr=h;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void main(String[] args) {
        PalidromeInLL p = new PalidromeInLL();
        p.insertAtTail(10);
        p.insertAtTail(20);
        p.insertAtTail(100);
        p.insertAtTail(100);
        p.insertAtTail(20);
        p.insertAtTail(10);
        p.printList();
        boolean flag=p.checkPalidrome();
        if(flag)
        {
            System.out.println("Palidrome Linked list");
        }
        else
        {
            System.out.println("Not Palidrome Linked list");
        }
        int value=p.PalidromeWithoutExtraSpace();
        System.out.println(value);
        p.printList();

    }
}
