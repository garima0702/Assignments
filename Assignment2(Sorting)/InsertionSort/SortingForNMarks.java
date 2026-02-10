import java.util.Arrays;

public class SortingForNMarks {

    public static void main(String[] args) {

        Student[] students = new Student[5];

        students[0] = new Student("A", new int[]{80, 70, 90});
        students[1] = new Student("B", new int[]{60, 85, 75});
        students[2] = new Student("C", new int[]{80, 70, 85});
        students[3] = new Student("D", new int[]{90, 60, 70});
        students[4] = new Student("E", new int[]{75, 80, 65});


        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && swap(students[j], key)) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }

        
        for (Student s : students) {
            System.out.println(s);
        }
    }


    public static boolean swap(Student s1, Student s2) {

        int len = Math.min(s1.marks.length, s2.marks.length);

        for (int i = 0; i < len; i++) {
            if (s1.marks[i] > s2.marks[i]) {
                return true; 
            } else if (s1.marks[i] < s2.marks[i]) {
                return false; 
            }
        }
        return false;
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
