import java.util.ArrayList;

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
/*
        System.out.println("Fanta: " + fanta.size);
        System.out.println("Mineralvatten: " + mineralvatten.size);

        // -------------------------------------------------------------------

        Human bjorn = new Human();
        Human blubb = new Human();
        Animal blopp = new Human();
        blopp.setName("Hej");
        blopp.getName();
        System.out.println("Bloppnamn: " + blopp.getName());

        bjorn.setName("Björn");
        blubb.setName("blubb");
        bjorn.test();
        blubb.test();
 */

        // Presenterat i video 2021-10-22
        ArrayList<Burk> minaBurkar = new ArrayList<Burk>();
        minaBurkar.add(fanta);

        for (int i = 0; i < minaBurkar.size(); i++) {
            Burk currentBurk = minaBurkar.get(i);
            System.out.println(currentBurk);
            //System.out.println(currentBurk.getContent());
            //System.out.println(minaBurkar.get(i));
        }

        /*
        System.out.println("minaSträngar exempel:");
        ArrayList<String> minaSträngar = new ArrayList<String>();

        minaSträngar.add("Hej");
        minaSträngar.add("Hopp");

        System.out.println(minaSträngar.get(0));

         */

    }
}
