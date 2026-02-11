import java.util.LinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}


class Stack{
    Node top;

    void push(int value){
        Node newNode= new Node(value);
        newNode.next=top;
        top=newNode;
        System.out.println(value + ": pushed to stack");
    }

    int pop(){
        if(top==null){
            System.out.println("Stack is empty");
            return -1;
        }
        int popped=top.data;
        top=top.next;
        return popped;
    }


    int peek(){
        if(top==null){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
}


public class StackWithLL {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        
    }

    
}
