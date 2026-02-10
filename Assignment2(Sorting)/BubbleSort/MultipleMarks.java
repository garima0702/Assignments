
class Student {

    int mark1;
    int mark2;
    int mark3;
    String name;

    Student(int m1, int m2, int m3, String n) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
        name = n;
    }

    public String toString() {
        return mark1 + " " + mark2 + " " + mark3 + " " + name;
    }
}

public class MultipleMarks{

    public static void main(String[] args) {

        Student[] arr = {
            new Student(80, 70, 60, "A"),
            new Student(80, 70, 50, "B"),
            new Student(80, 60, 90, "C"),
            new Student(75, 90, 95, "D"),
            new Student(80, 70, 60, "E")
        };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                boolean swap = false;

                if (arr[j].mark1 > arr[j + 1].mark1) {
                    swap = true; 
                }else if (arr[j].mark1 == arr[j + 1].mark1
                        && arr[j].mark2 > arr[j + 1].mark2) {
                    swap = true; 
                }else if (arr[j].mark1 == arr[j + 1].mark1
                        && arr[j].mark2 == arr[j + 1].mark2
                        && arr[j].mark3 > arr[j + 1].mark3) {
                    swap = true;
                }

                if (swap) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
