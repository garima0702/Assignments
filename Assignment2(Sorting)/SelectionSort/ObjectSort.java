
import java.util.ArrayList;

public class ObjectSort {

    public static void main(String[] args) {

        ArrayList<Student> stu = new ArrayList<>();
        stu.add(new Student("A", 12));
        stu.add(new Student("B", 25));
        stu.add(new Student("C", 32));
        stu.add(new Student("D", 24));
        stu.add(new Student("E", 26));
        stu.add(new Student("F", 100));
        stu.add(new Student("G", 92));
        stu.add(new Student("H", 62));
        stu.add(new Student("I", 72));

        sSort(stu);

        for (Student s : stu) {
            System.out.println(s);
        }
    }

    public static ArrayList<Student> sSort(ArrayList<Student> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getMarks() < list.get(minIndex).getMarks()) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                Student temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
        return list;
    }
}

class Student {

    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.marks = marks;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public String toString() {
        return "Name: " + name + " Marks: " + marks;
    }
}
