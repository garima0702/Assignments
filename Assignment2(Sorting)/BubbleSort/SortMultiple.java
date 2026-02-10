
import java.util.Arrays;

class Student {

    int[] markn;

    String name;

    Student(int[] marks, String name) {
        markn = marks;
        this.name = name;
    }

    public String toString() {
        return Arrays.toString(markn) + " " + name;
    }
}

public class SortMultiple {

    public static void main(String[] args) {
        Student[] arr = {
            new Student(new int[]{13, 47, 56}, "A"),
            new Student(new int[]{24, 46, 56}, "B"),
            new Student(new int[]{27, 41, 57}, "C"),
            new Student(new int[]{24, 42, 60}, "D"),
            new Student(new int[]{23, 40, 60}, "E")
        };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                boolean swap = false;
//

                int k = 0;
                while (k < arr[j].markn.length) {
                    if (arr[j].markn[k] > arr[j + 1].markn[k]) {
                        swap = true;
                        break;
                    }
                    if (arr[j].markn[k] < arr[j + 1].markn[k]) {
                        break;
                    }
                    k++;
                }

                if (swap) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}