public class CircularDoublyLinkedList {
    Node head;
    Node tail;
    
    class Node{
        int data;
        Node next;
        Node prev;
        
        Node(int d){
            data = d;
        }
    }
    
    void appendToTail(int d){
        if(head == null){
            head = new Node(d);
            head.next = head;
            head.prev = head;
            tail = head;
        }
        else{
            Node temp = head;
            while(temp != tail){
                temp = temp.next;
            }

            tail = new Node(d);
            tail.next = head;
            temp.next = tail;
            tail.prev = temp;
            head.prev = tail;
            
        }
    }
    
    boolean delete(int d ){
        if(head == null) return false;
        else if(head.data == d){
            if(head.next == head){
                tail = null;
                head = null;
            }
            else{
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }
            return true;
        }
        else{
            Node temp = head;
            while(temp.next!=head){
                if(temp.next.data == d){
                    if(temp.next == tail){
                        tail = temp;
                        tail.next = head;
                        head.prev = tail;
                    }
                    else{
                        temp.next = temp.next.next;
                        temp.next.prev = temp;
                    }
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
        
    }
    
    void print(){
         if(head==null){
            System.out.print("[ ]");
        }
        else{
            
            Node temp = head;
            do{
                System.out.print("[ "+ temp.data +" ]");
                temp = temp.next;
            }while(temp!=head);
        }
    }
    
    void printFromLast(){
         if(head==null){
            System.out.print("[ ]");
        }
        else{
            
            Node temp = tail;
            do{
                System.out.print("[ "+ temp.data +" ]");
                temp = temp.prev;
            }while(temp!=tail);
        }
    }
}
