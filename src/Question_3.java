public class Question_3 {
//    Create a Stack using Linked List
    public static void main(String[] args) {
        StackWithLL stack = new StackWithLL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();
        System.out.println("top : "+stack.top());
        System.out.println("size : "+stack.size());
        System.out.println("isEmpty : "+stack.isEmpty());
    }
}

class StackWithLL{
    Node head;
    void push(int x){
        Node value = new Node(x);
        value.next = head;
        head = value;
    }
    void pop(){
        if(!isEmpty()) {
            head = head.next;
        }
    }
    int top(){
        if(!isEmpty()) {
            return head.data;
        }
        return 0;
    }
    int size(){
        Node temp = head;
        int cnt = 0;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }
    boolean isEmpty(){
        if(size() == 0){
            return true;
        }
        return false;
    }
}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
