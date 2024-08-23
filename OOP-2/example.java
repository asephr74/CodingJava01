public class Example {
    private int id;
    private String name;

    public Example(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Example{id=" + id + ", name='" + name + "'}";
    }

    public static void main(String[] args) {
        Example example = new Example(1, "Sample");
        System.out.println(example.toString()); // Output: Example{id=1, name='Sample'}
    }
}