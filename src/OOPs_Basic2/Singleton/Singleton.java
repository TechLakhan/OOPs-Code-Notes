package OOPs_Basic2.Singleton;

public class Singleton {
    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
//      check if instance is being created for the first time or not
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
