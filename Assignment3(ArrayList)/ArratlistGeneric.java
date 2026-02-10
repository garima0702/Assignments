


public class ArratlistGeneric {
    public static void main(String[] args) {
        //can be used if we dont extend comparable interface
        // MyArrayList list1 = new MyArrayList();
        // list1.add(10);
        // list1.add("hello");
        // list1.add('5');
        // list1.add(20);
        // list1.add("Yellow");
        // list1.add('7');
        // list1.print();
        // list1.remove(2);
        // list1.print();
        // System.out.println(list1.get(3));
        // System.out.println(list1.search(10));

        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(10);
        list2.add(90);
        list2.add(50);
        list2.add(46);
        list2.print();
        list2.sort();
        list2.print();
        
        
    }
    
    
      
}

class MyArrayList<T extends Comparable<T>>{
    
    
    private T[] data;
    private int size;

    public MyArrayList() {
        data=(T[]) new Comparable[4];
        size=0;
        
    }


    public void add(T a) {
        if(size==data.length){
            resize();
        }
        data[size++]=a;
        
        
    }



    private void resize(){
        T[] newData=(T[]) new Object[data.length *2];
        for(int i=0;i<data.length;i++){
            newData[i]=data[i];
        }
        data= newData;
       
    }

    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    public T get(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }

    public void remove(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException();
        }

        for(int i=index;i<size-1;i++){
            data[i]=data[i+1];
        }
        data[size-1]=null;
        size--;
    }

    public int search(T k){
        for(int i=0;i<size;i++){
            
            if(data[i].equals(k)){
                return i;
            }
            
        }
        return -1;
    }

    public void sort(){
                                 

       for(int i =0;i<size-1;i++) {
			boolean b=false;
			for(int j=0; j<size-i-1; j++) {
                if(data[j] instanceof Comparable && data[j+1] instanceof Comparable) {
                    Comparable c1 = (Comparable) data[j];
                    Comparable c2 = (Comparable) data[j+1];
                    if(c1.compareTo(c2) > 0) {
                        T temp = data[j];
                        data[j]=data[j+1];
                        data[j+1]=temp;
                        b=true;
                    }
				}
			
			}
            if(b==false) {
				break;
	    	}
		
	    }

    
}  
}

