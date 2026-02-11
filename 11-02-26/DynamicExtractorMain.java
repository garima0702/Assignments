// Functional Interface
interface Function<T, K> {
    K call(T obj);
}

// Generic Extractor Class
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

// Student Class
class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

// Main Class
public class DynamicExtractorMain {
    public static void main(String[] args) {

        Student s = new Student(1, "ABC", 23);

        // Extract Name
        DynamicExtractor<Student, String> nameExtractor =
                new DynamicExtractor<>(student -> student.name);

        // Extract Age
        DynamicExtractor<Student, Integer> ageExtractor =
                new DynamicExtractor<>(student -> student.age);

        System.out.println("Name: " + nameExtractor.extract(s));
        System.out.println("Age: " + ageExtractor.extract(s));
    }
}