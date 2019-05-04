/**
 * Created by sunny on 10/17/18.
 */
public class Stack {

    int[] stack = new int[5];
    int top = 0;

    public void push(int data){
        if(top == size()){
            System.out.println("Stack is Full");
        }
        else {
            stack[top] = data;
            top++;
        }
    }

    public int pop(){
        int data = 0;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            top--;
            data = stack[top];
            stack[top] = 0;
        }
        return data;
    }

    public int peek(){
        int data;

        data = stack[top - 1];
        return data;

    }

    public int size(){

        return top;

    }

    public boolean isEmpty(){
        return top <= 0;
    }

    public void show(){
        for(int i = 0; i < stack.length; i++){
            System.out.print(stack[i] + " ");
        }
    }
}
