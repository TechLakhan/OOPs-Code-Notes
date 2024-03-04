package OOPs_Basic2.staticExample;

public class Example {
    static class Garbagevalue {
        int x;
        String name;
        boolean isAlive;

        public Garbagevalue(int x, String name, boolean isAlive) {
            this.x = x;
            this.name = name;
            this.isAlive = isAlive;
        }

        public Garbagevalue() {
        }
    }

    public static void main(String[] args) {

        Garbagevalue new1 = new Garbagevalue();
        System.out.println(new1.name);
        System.out.println(new1.x);
        System.out.println(new1.isAlive);
    }
}
