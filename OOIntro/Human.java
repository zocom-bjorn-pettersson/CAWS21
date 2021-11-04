public class Human extends Animal {
    // Tips: För att skapa getter- och settermetoder kan du högerklicka
    // på det attribut du vill ha inkapslade och välja "Generate > Getter and Setter"
    Burk burk;

    public Burk getBurk() {
        return burk;
    }

    public void setBurk(Burk burk) {
        this.burk = burk;
    }

    public boolean hasBurk() {
        return burk != null; // Returns true if the human _does not_ have a burk
    }

    public Human() {
        super();
    }

    public Human(String name) {
        this.setName(name);
    }
}
