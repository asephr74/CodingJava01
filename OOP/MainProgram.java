public class MainProgram {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        statistics.addNumber(1);
        statistics.addNumber(2);
        //statistics.addNumber(3);
        //statistics.addNumber(4);
        System.out.println("Count: " + statistics.getCount());
    }
}