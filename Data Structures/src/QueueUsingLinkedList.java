/**
 * Created by sunny on 10/23/18.
 */
public class QueueUsingLinkedList {
    private Node front;
    private Node rear;


    public void Enqueue(int data) {
        Node n = new Node();
        n.data = data;
        n.next = null;

        if (front == null) {
            front = n;
            rear = n;
        }
        else {
            rear.next = n;
            rear = rear.next;

        }
    }


    public void deQueue(){
        front = front.next;
    }

    public void show(){
        Node n = front;
        while(n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }

    public boolean isEmpty(){
        return front == null;
    }

    public static void main(String args[]){
        QueueUsingLinkedList q = new QueueUsingLinkedList();
        q.Enqueue(5);
        q.Enqueue(7);
        q.Enqueue(3);

        q.show();

        q.deQueue();

        q.show();
    }

}
