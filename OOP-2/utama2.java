public class utama2 {
    public static void main(String[] args) {
        stat2 statistics = new stat2();
        statistics.addNumber(4);
        statistics.addNumber(2);
        statistics.addNumber(5);
        statistics.addNumber(4);
        statistics.addNumber(-1);
        statistics.addNumber(20);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
        System.out.println("Sum even: " + statistics.sumeven());
        System.out.println("Sum odd: " + statistics.sumodd());
        
    }
}