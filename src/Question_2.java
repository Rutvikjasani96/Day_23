import java.util.ArrayList;

public class Question_2 {
//    Create a Stack using Lists
    public static void main(String[] args) {
        StackWithLists stack = new StackWithLists();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.isEmpty());
    }
}

class StackWithLists{
    ArrayList<Integer> list = new ArrayList<>();
    void push(int x){
        list.add(x);
    }
    void pop(){
        if(!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
    }
    int top(){
        if(!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        return 0;
    }
    int size(){
        return list.size();
    }
    boolean isEmpty(){
        return list.isEmpty();
    }
}
