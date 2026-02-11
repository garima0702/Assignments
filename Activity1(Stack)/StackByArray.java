class Stack{
    int maxSize;
    int[] stackArray;
    int top;

    Stack(int size){
        this.maxSize=size;
        this.stackArray=new int[maxSize];
        this.top=-1;
    }

    void push(int value){
        if(top==maxSize){
            System.out.println("Stack is full");
        }
        stackArray[top+1]=value;
        top++;
    }

    int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        int popped=stackArray[top];
        top--;
        return popped;
    }

    int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }
}

class StackByArray{
    public static void main(String[] args) {
        Stack st=new Stack(10);
        System.out.println(st.pop()); 
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.pop());
        System.out.println(st.peek());  
        
    }
}