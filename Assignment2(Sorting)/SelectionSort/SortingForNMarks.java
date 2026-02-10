import java.util.Arrays;

public class SortingForNMarks {

    public static void main(String[] args) {

        Student[] students = new Student[5];

        students[0] = new Student("A", new int[]{80, 70, 90});
        students[1] = new Student("B", new int[]{60, 85, 75});
        students[2] = new Student("C", new int[]{80, 70, 85});
        students[3] = new Student("D", new int[]{90, 60, 70});
        students[4] = new Student("E", new int[]{75, 80, 65});

        
        for (int i = 0; i < students.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < students.length; j++) {
                if (swap(students[minIndex], students[j])) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                Student temp = students[i];
                students[i] = students[minIndex];
                students[minIndex] = temp;
            }
        }

        
        for (Student s : students) {
            System.out.println(s);
        }
    }

    
    public static boolean swap(Student s1, Student s2) {

        int len = Math.min(s1.marks.length, s2.marks.length);

        for (int i = 0; i < len; i++) {
            if (s1.marks[i] > s2.marks[i]) {
                return true;    // swap
            } else if (s1.marks[i] < s2.marks[i]) {
                return false; 
            }
        }
        return false; //equal
    }
}

class Student {

    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Marks: " + Arrays.toString(marks);
    }
}
