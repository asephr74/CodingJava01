public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        listElements(numbers);
    }

    public static void listElements(int[] intar) {
        System.out.println("the elements of the array are: ");
        int index = 0;
        while (index < intar.length) {
            int number = intar[index];
            System.out.print(number + " ");
            index = index + 1;
        }

        System.out.println("");
    }
}