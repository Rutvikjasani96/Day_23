public class Question_1 {
//    Create a Stack using Arrays
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.push(6);
        st.push(45);
        st.push(46);
        st.push(47);
        st.push(48);
        st.push(49);
        st.pop();
        System.out.println(st.size());
        System.out.println(st.top());
        System.out.println(st.isEmpty());
    }
}

class Stack{
    int[] array = new int[10];
    int top = 0;
    void push(int x){
        array[top] = x;
        top++;
    }
    void pop(){
        if(top>0) {
            top--;
        }
    }
    int size(){
        return top;
    }
    boolean isEmpty(){
        if(top==0){
            return true;
        }
        return false;
    }
    int top(){
        if (top==0){
            return 0;
        }
        return array[top-1];
    }
}