package OOPs_Pillars.Polymorphism.Overriding;

public class Oneday extends Cricketmatch {
    @Override
    void matchInfo() {
        System.out.println("This is a 50 over game !");
    }
    // here the function matchInfo is same here in child class & also present
    // in its parent class Cricketmatch.java, so this is terminology is called Method overriding.
}
