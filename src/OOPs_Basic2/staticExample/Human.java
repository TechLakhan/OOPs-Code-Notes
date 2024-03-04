package OOPs_Basic2.staticExample;

public class Human {
    int age;
    String name;
    boolean isAlive;
    static double population;

    public Human(int age,String name, boolean isAlive) {
        this.age = age;
        this.name = name;
        this.isAlive = isAlive;
        Human.population += 1;
    }

    public Human() {

    }

    static void greetings() {
        System.out.println(" You are Awesome !");
//      System.out.println(this.age); - "this" keyword can't be used in static methods as it represents the instance of a class, i.e object.
    }

    void fun2() {
        greetings();
    }

    public static void main(String[] args) {
//        greetings();
//        This will not work as non-static methods & variables can't be invoked in static methods without referencing their instance.'

//        hence referencing it below.
        Human lakhan = new Human(21, "Lucky Patil", true);
        lakhan.greetings();
        Human funn = new Human();
        funn.fun2();
    }
}
