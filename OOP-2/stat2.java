public class stat2 {
    private int count;
    private int sum;
    private int sumeven;
    private int sumodd;
    private int tote;
    private int toto;

    public stat2() {
        count = 0;
        sum = 0;
        sumeven=0;
        sumodd=0;
        tote=0;
        toto=0;
    }

    public void addNumber(int number) {
        count++;
        sum = sum + number;
        if(number%2==0){
            tote=tote+number;
        }
        else {
            toto=toto+number;
        }
        
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }
    
    public int sumeven() {
        return tote;
    }

    public int sumodd() {
        return toto;
    }


    public double average() {
        return sum / count;
    }
}