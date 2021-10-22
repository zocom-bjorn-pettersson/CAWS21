public class Burk {
    int size;
    String material;
    String color;
    String content;

    // Constructor
    public Burk(int newSize, String material, String color) {
        size = newSize;
        this.material = material;
        this.color    = color;
        this.content  = "unknown";
    }

    public String toString() {
        return "En Burk: Av materialet " + material + ", av storlek " + size;
    }

}
