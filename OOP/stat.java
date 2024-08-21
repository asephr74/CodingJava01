public class Stat {
    private int count;
    private int sum;

    public Stat() {
        count=0;
        sum=0;
    }

    public void addNumber(int number) {
        count++;
        sum=sum+number;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        return sum/count;
    }
}