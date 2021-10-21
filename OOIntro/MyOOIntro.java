public class MyOOIntro {
    public static void main(String[] args) {
        Animal djur = new Animal("Babba");
/*
        Burk fanta = new Burk();
        Burk mineralvatten = new Burk();

        fanta.size = 33;
        fanta.color = "Yellow";
        fanta.material = "Aluminium";
        fanta.content = "Fanta";

        mineralvatten.size = 50;
        mineralvatten.color = "White";
        mineralvatten.material = "Aluminium";
        mineralvatten.content = "Bubbelvatten";
 */

        Burk fanta = new Burk(33, "Aluminium", "Yellow");
        Burk mineralvatten = new Burk(50, "Aluminium", "White");

        fanta.content = "Fanta";
        mineralvatten.content = "Mineralvatten";

        System.out.println("Fanta: " + fanta.size);
        System.out.println("Mineralvatten: " + mineralvatten.size);
    }
}
