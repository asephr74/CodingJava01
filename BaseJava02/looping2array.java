public class Main {
    public static void main(String[] args) {
        String[] arrayOfStrings = {"Matti L.", "Matti P.", "Matti V."};
        double[] arrayOfFloatingpoints = {1.20, 3.14, 100.0, 0.6666666667};

        int minLength = Math.min(arrayOfStrings.length, arrayOfFloatingpoints.length);//mencari nilai min antara 2 array
        for (int i = 0; i < minLength; i++) {
            System.out.println(arrayOfStrings[i] + " " +  arrayOfFloatingpoints[i]);
        }
    }
}