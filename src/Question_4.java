public class Question_4 {
//    Create Queues using Arrays
    public static void main(String[] args) {
        QueueArray queue = new QueueArray();
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        queue.push(50);
        queue.push(60);
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        System.out.println("rear : "+queue.rear());
        System.out.println("front : "+queue.front());
        System.out.println("Size : "+queue.size());
    }
}

class QueueArray{
    int[] array = new int[10];
    int top = -1;
    void push(int x){
        top++;
        array[top] = x;
    }
    void pop(){
        for(int i=0;i< array.length-1;i++){
            array[i] = array[i+1];
        }
        top--;
    }
    int rear(){
        if(size()>0) {
            return array[top];
        }
        return 0;
    }
    int front(){
        return array[0];
    }
    int size(){
        return top+1;
    }
}
