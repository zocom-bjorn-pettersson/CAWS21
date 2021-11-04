public class Animal {
    private String name;

    public Animal() {

    }

    public Animal(String name) {
        this.setName(name);
    }

    public void test() {
        System.out.println("Hej från Animal! Jag heter " + getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
