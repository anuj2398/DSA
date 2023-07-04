package LinkedList;

class Node{
    int data;
    Node next;
    public Node(int val){
        this.data=val;
        this.next=null;
    }
}

public class LinkedList {

    Node head;
    
    public void addNode(int val){
        //create a node
        Node newNode=new Node(val);
        //point head to the new node
        head=newNode;
    }
    public void addBegin(int val){
        //create a node
        Node newNode=new Node(val);
        //point the new head before the current head
        newNode.next=head;
        //make the new node head
        head=newNode;
    }
    public void addEnd(int val){
        
        //edge case:if node is empty , last node=head
        if(head==null){
            addBegin(val);
        }
        //create a node
        Node newNode=new Node(val);
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }
    public void deleteBegin(){
        if(head!=null){
            head=head.next;
        }
    }
    public void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.display();
        ll.addNode(5);
        ll.display();
        ll.addBegin(0);
        ll.display();
        ll.addBegin(3);
        ll.display();
        ll.addEnd(9);
        ll.display();
        ll.addBegin(1);
        ll.display();
        ll.deleteBegin();
        ll.display();
    }
}
