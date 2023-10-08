public class DoublyLinkedList {
    Node head;
    
    class Node{
        int data;
        Node next;
        Node prev;
        
        Node(int d){
            data = d;
        }
    }
    
    void appendToTail(int d){
        if(head==null) head = new Node(d);
        else{
            Node end = new Node(d);
            Node temp = head;
            
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = end;
            end.prev = temp;
        }
    }
    
    boolean delete(int d){
        if(head == null)return false;
        else if(head.data == d){
            if(head.next == null)head = null;
            else head = head.next;
            return true;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                if(temp.next.data == d){
                    temp.next = temp.next.next;
                    if(temp.next != null)temp.next.prev = temp;
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    }
    
    void print(){
        if(head == null) System.out.print("[ ]");
        
        else{
            Node temp = head;
            while(temp != null){
                System.out.print("[ "+ temp.data + " ]");
                temp = temp.next;
            }
        }
    }
     
}
