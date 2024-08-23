import java.util.Scanner;

public class utama3 {
    public static void main(String[] args) {
        int i=0;
       
        
        Scanner read=new Scanner(System.in);
        stat3 statistics = new stat3();
        
        System.out.println("jumlah data =");
        int input1=Integer.valueOf(read.nextLine());
        
        System.out.println("---------");
        
        while(i<input1){
            int input2=Integer.valueOf(read.nextLine());
            statistics.addNumber(input2);
            i++;
        }
    
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
        System.out.println("Sum even: " + statistics.sumeven());
        System.out.println("Sum odd: " + statistics.sumodd());
        
    }
}