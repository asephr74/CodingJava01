
import java.util.ArrayList;
import java.util.Scanner;

public class showarrayfor{
   public static void main(String[] args) {
   ArrayList<String> teachers = new ArrayList<>();

  teachers.add("Simon");
  teachers.add("Samuel");
  teachers.add("Ann");
  teachers.add("Anna");

for (int index = 0; index < teachers.size(); index++) {//int index:deklarasi variabel
    System.out.println(teachers.get(index));
}
    }
}
