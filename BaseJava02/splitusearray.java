public class Main {
    public static void main(String[] args) {
        String data = "A1,B2,C45,D3";
        
        // Split the string by commas
        String[] parts = data.split(",");
        
        // Print each part
        for (String part : parts) {
            System.out.println(part);
        }
    }
}





