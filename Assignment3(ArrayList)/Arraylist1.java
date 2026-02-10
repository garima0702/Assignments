public class Arraylist1 {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(90);
        list.add(50);
        list.add(80);
        list.add(70);
        list.add(20);
        list.print();
        System.out.println(list.get(2));
        list.remove(5);
        list.print();
        System.out.println(list.search(20));
        list.sort();
        list.print();
        
        
    }

    
}

class MyArrayList{
    
    private int[] data;
    private int size;

    public MyArrayList() {
        data=new int[4];
        size=0;
        
    }


    public void add(int a) {
        if(size==data.length){
            resize();
        }
        data[size++]=a;
        
    }



    private void resize(){
        int[] newData=new int[data.length *2];
        for(int i=0;i<data.length;i++){
            newData[i]=data[i];
        }
        data=newData;
    }

    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    public int get(int index){
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
        data[size-1]=0;
        size--;
    }

    public int search(int k){
        for(int i=0;i<size;i++){
            if(data[i]==k){
                return i-1;
            }
            
        }
        return -1;
    }

    public void sort(){
       for(int i =0;i<size-1;i++) {
			boolean b=false;
			for(int j=0; j<size-i-1; j++) {
				if(data[j]>data[j+1]) {
					int temp = data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
					b=true;
				}
				
				}
			if(b==false) {
				break;
			}
		}
		
	}

    
    
}