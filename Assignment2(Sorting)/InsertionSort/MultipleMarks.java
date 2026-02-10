
public class MultipleMarks {

    public static void main(String[] args) {

        Student[] var1 = new Student[]{
            new Student(80, 70, 60, "A"),
            new Student(80, 70, 50, "B"),
            new Student(80, 60, 90, "C"),
            new Student(75, 90, 95, "D"),
            new Student(80, 70, 60, "E")
        };

        for (int i = 1; i < var1.length; i++) {
            Student key = var1[i];
            int j = i - 1;

            while (j >= 0 && shouldSwap(var1[j], key)) {
                var1[j + 1] = var1[j];
                j--;
            }
            var1[j + 1] = key;
        }

        for (int i = 0; i < var1.length; i++) {
            System.out.println(var1[i]);
        }
    }

    // same comparison logic as bubble sort
    public static boolean shouldSwap(Student s1, Student s2) {
        if (s1.mark1 > s2.mark1) {
            return true; 
        }else if (s1.mark1 == s2.mark1 && s1.mark2 > s2.mark2) {
            return true; 
        }else if (s1.mark1 == s2.mark1 && s1.mark2 == s2.mark2 && s1.mark3 > s2.mark3) {
            return true;
        }

        return false;
    }
}
class Student {

    int mark1;
    int mark2;
    int mark3;
    String name;

    Student(int m1, int m2, int m3, String name) {
        this.mark1 = m1;
        this.mark2 = m2;
        this.mark3 = m3;
        this.name = name;
    }

    public String toString() {
        return "Name: " + name + " Marks: " + mark1 + " " + mark2 + " " + mark3;
    }
}
