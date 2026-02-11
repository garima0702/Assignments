class Node<T>{
     
    T data;
    Node <T> next;

    Node(T data){
        this.data=data;
        this.next=null;
    }
}


class Stack<T>{
    Node <T> top;

    void push(T value){
        Node<T> newNode= new Node<>(value);
        newNode.next=top;
        top=newNode;
        System.out.println(value+ ": pushed to stack");
    }

    T pop(){
        if(top==null){
            System.out.println("Stack is empty");
            return null;
        }
        T popped=top.data;
        top=top.next;
        return popped;
    }


    T peek(){
        if(top==null){
            System.out.println("Stack is empty");
            return null;
        }
        return top.data;
    }
}


public class StackGeneric  {
    public static void main(String[] args) {
        
        Stack stack=new Stack();
        stack.push(10);
        stack.push("hello");
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        
    }

    
}


