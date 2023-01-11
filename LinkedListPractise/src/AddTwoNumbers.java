import java.util.LinkedList;

public class AddTwoNumbers {
  
    public Node reverse(Node h)
    {
        Node prev=null;
        Node nextNode=null;
        Node curr=h;
        while(curr!=null)
        {
            nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
    public static void main(String[] args) {
        AddTwoNumbers ad= new AddTwoNumbers();
        LinkedList<Integer> list1= new LinkedList<Integer>();
        LinkedList<Integer> list2= new LinkedList<Integer>();
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list2.add(4);
        list2.add(4);
        System.out.println(list1.get(0));
    }
}
