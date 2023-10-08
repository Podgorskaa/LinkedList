public class LinkedList {
    private Node head;
    
    class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
        }
    }
    
    void appendToTail(int d){
        Node end = new Node(d);
        if(head == null){
            head = end;
        }
        else{
            Node temp = head;
            
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = end;
        }
    }
    
    boolean delete(int d){
        if(head == null) return false;
        Node temp = head;
        
        if(head.data == d){
            if(head.next == null)head = null;
            else head = head.next;
            return true;
        }
        
        while(temp.next != null){
            if(temp.next.data == d){
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    
    void print(){
        if(head == null)System.out.print("[ ]");
        else{
            Node temp = head;
            while(temp != null){
                System.out.print("[ " + temp.data + " ] ");
                temp = temp.next;
            }
        }
    }
}
