public class Statistics {
    private int count;

    // Constructor
    public Statistics() {
        count = 0;
    }

    // Method to add a number
    public void addNumber(int number) {
        count=count+1;
        
    }

    // Method to get the count of numbers added
    public int getCount() {
        return count;
    }
}