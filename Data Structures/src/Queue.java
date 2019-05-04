import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by sunny on 10/23/18.
 */
public class Queue {
    int queue[] = new int[5];
    int size;
    int front;
    int rear;

    public void enQueue(int data){
        if(!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size++;
        }
        else{
            System.out.println("Queue is Full");
        }
    }

    public void show(){
        for(int i = 0; i < size; i++){
            System.out.print(queue[(front + i) % 5] + " ");
        }
    }

    public int deQueue(){
        int data = queue[front];
        if(!isEmpty()) {
            front = (front + 1) % 5;
            size--;
            return front;
        }
        else{
            System.out.println("Queue is Empty");
        }

        return front;


    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == 5;
    }

}
