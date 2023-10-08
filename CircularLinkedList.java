public class CircularLinkedList {
    Node head;
    Node tail;
    
    class Node{
        int data;
        Node next;
        
        public Node(int d){
            data = d;
        }
    }
    
    void appendToTail(int d){
        if(head==null){
            head = new Node(d);
            tail = head;
            head.next = tail;
         
        }
        else{
            Node tail = new Node(d);
            
            Node temp = head;
            while(temp.next!=head){
                temp = temp.next;
            }
            
            temp.next = tail;
            temp.next.next = head; 
        }
    }
    
    boolean delete(int d){
        if(head==null)return false;
        else if(head.data == d){
            
            if(head.next == head)head = null;
            else{
                head = head.next;
                tail.next = head.next;
            }
            
            return true;
        }
        else{
            Node temp = head;
            
            do{
                if(temp.next.data == d){
                    if(temp.next == tail){
                        temp.next = null;
                        tail = temp;
                    }
                    else temp.next = temp.next.next;
                    return true;
                }
                
                temp = temp.next;
            }while(temp!=tail);
            
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
            }while(head!=temp);
        }
    }
    
}
