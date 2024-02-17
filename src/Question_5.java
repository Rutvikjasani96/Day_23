public class Question_5 {
//    Create Queues using Linked List
    public static void main(String[] args) {
        QueueLL queue = new QueueLL();
        queue.push(6);
        queue.push(7);
        queue.push(8);
        queue.pop();
        queue.pop();
        System.out.println("front : "+queue.front());
        System.out.println("rear : "+queue.rear());
        System.out.println("isEmpty : "+queue.isEmpty());
    }
}

class QueueLL{
    Node head = new Node(5);
    Node temp = head;
    int cnt = 1;
    void push(int x){
        temp.next = new Node(x);
        temp = temp.next;
        cnt++;
    }
    void pop(){
        if(!isEmpty()) {
            head = head.next;
            cnt--;
        }
    }
    int size(){
        return cnt;
    }
    int front(){
        if(cnt>0) {
            return head.data;
        }
        return 0;
    }
    int rear(){
        if(cnt>0){
            return temp.data;
        }
        return 0;
    }
    boolean isEmpty(){
        if(cnt>0){
            return false;
        }
        return true;
    }
}
