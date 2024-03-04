package OOPs_Basic2.staticExample;



public class InnerClasses {
    static class Textation {
        String name;

        public Textation(String name) {
            this.name = name;
        }

        public Textation(Textation other) {
            this.name = other.name;
        }
    }

    public static void main(String[] args) {
//        Textation lakhan = new Textation("Lucky");
        Textation shri = new Textation("Shri");
        Textation ram = new Textation();

//        System.out.println(lakhan.name);
//        System.out.println(shri.name);
        System.out.println(ram.name);

    }
}
