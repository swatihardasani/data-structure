/**
 * Created by swati on 10/18/18.
 */
public class Stack2 {

    private Node top;

    public Stack2(){
        this.top = null;
    }

    public void push(int x){
        Node node = new Node();
        node.data = x;
        node.next = null;

        if(top == null){
            top = node;
        }
        else{
            node.next = top;
            top = node;
        }
    }

    public boolean isEmpty(){
        return (top == null);
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return - 1;
        }
        return top.data;
    }

    public void pop(){
        Node n = top;
        top = top.next;
        n = null;
    }

    public void show(){
        Node n = top;
        while(n != null){
            System.out.println(n.data);
            n = n.next;
        }

    }

    public static void main(String args[]){
       Stack2 stack = new Stack2();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.show();

        System.out.println("Top element is " + stack.peek());

        stack.pop();

        System.out.println("Top element is " + stack.peek());


        stack.show();


    }
}
