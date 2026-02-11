interface Function<T, K> {
    K call(T obj);
}

class DynamicExtractor<T, K> {

    private Function<T, K> function;

    // Constructor
    DynamicExtractor(Function<T, K> function) {
        this.function = function;
    }

    // Extract method
    K extract(T obj) {
        return function.call(obj);
    }
}


interface Comparator<T>{
    int compare(T a, T b);
}

class UniComparator<T> implements Comparator<T>{
    public int compare(T a, T b){
        if(a ==null && b==null){
            return 0;
        }
        if(a==null){
            return -1;
        }
        if(b==null){
            return 1;
        }
        if(a instanceof Integer && b instanceof Integer){
            return(Integer)a -(Integer)b;
        }
        if(a instanceof String && b instanceof String){
           int len = Math.min(a.toString().length(),b.toString().length());

            for(int i=0;i<len;i++){
                if(a.toString().charAt(i)!= b.toString().charAt(i)){
                return a.toString().charAt(i)-b.toString().charAt(i);
                }
            }
            return a.toString().length() - b.toString().length();
        }

        throw new RuntimeException("Unsupported type");
}
}


class Student{
    int id;
    String name;
    int age;

    Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
    return id + " " + name + " " + age;
    }

}



class MyArrayList<T>{
    
    
    private T[] data;
    private int size;

    public MyArrayList() {
        data=(T[]) new Object[4];
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

    @SuppressWarnings("unchecked")
public <K> void sort(DynamicExtractor<T, K> extractor, Comparator<K> comparator) {

    for (int i = 0; i < size - 1; i++) {
        for (int j = 0; j < size - i - 1; j++) {

            T obj1 = (T) data[j];
            T obj2 = (T) data[j + 1];

            K key1 = extractor.extract(obj1);
            K key2 = extractor.extract(obj2);

            if (comparator.compare(key1, key2) > 0) {

                // swap
                T temp = data[j];
                data[j] = data[j + 1];
                data[j + 1] = temp;
                
            }
        }
    }
}


    

    
}  




public class CustomSorting{
    public static void main(String[] args) {
        MyArrayList<Student> list = new MyArrayList<>();

        
        list.add(new Student(1, "ankit", 20));
        list.add(new Student(2, "ashwin", 19));
        list.add(new Student(3, "aayush", 18));

        // Extract age
        DynamicExtractor<Student, Integer> ageExtractor =
                new DynamicExtractor<>(s -> s.age);

        UniComparator<Integer> comparator = new UniComparator<>();

        list.sort(ageExtractor, comparator);

        list.print();


        // Extract name
        DynamicExtractor<Student, String> nameExtractor =
                new DynamicExtractor<>(s -> s.name);

        UniComparator<String> stringComparator = new UniComparator<>();

        list.sort(nameExtractor, stringComparator);

        list.print();

        // Extract id
        DynamicExtractor<Student,Integer > idExtractor =
                new DynamicExtractor<>(s -> s.id);

        UniComparator<Integer> intComparator = new UniComparator<>();

        list.sort(idExtractor, intComparator);

        list.print();
    }
}

       
        
 
