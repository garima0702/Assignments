

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

        iSort(stu);

        for (Student s : stu) {
            System.out.println(s);
        }
    }


    public static ArrayList<Student> iSort(ArrayList<Student> list) {

        for (int i = 1; i < list.size(); i++) {
            Student key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j).getMarks() > key.getMarks()) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
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
