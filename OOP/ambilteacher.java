public class ambilteacher{
public static void main(String[] args) {
    Teacher teacher = new Teacher();

    int grading = teacher.grade();

    System.out.println("The grade received is " + grading);
    System.out.println("The grade received is " + teacher.grade());
    
}
}