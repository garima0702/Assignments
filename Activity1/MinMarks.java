import java.util.ArrayList;
import java.util.Collections;

public class MinMarks{


 public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(70);
        marks.add(85);
        marks.add(60);
        marks.add(90);
        marks.add(75);

        
        marks.add(2, 88);

        
        int min = Collections.min(marks);
        marks.remove(Integer.valueOf(min));

        System.out.println("Final Marks: " + marks);
    }
}