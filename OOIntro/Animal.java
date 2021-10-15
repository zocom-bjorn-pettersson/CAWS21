public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void test() {
        System.out.println("Hej från Animal! Jag heter " + name);
    }
}
