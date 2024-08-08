public class Person {
    private String name;
    private int age;

    public Person(String initialName,Integer initage) {
        this.age = initage;
        this.name = initialName;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }
}