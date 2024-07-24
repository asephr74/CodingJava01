
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        
        ArrayList<String> teachers = new ArrayList<>();

        teachers.add("Simon");
        teachers.add("Samuel");
        teachers.add("Ann");
        teachers.add("Anna");

        for (String teacher: teachers) {//string variabel teacher untuk for-each
            System.out.println(teacher);
        }
    }
}
