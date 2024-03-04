package OOPs_Pillars.Inheritance.Multi_Level_Inheritance;

public class Boxprice extends Boxweight {
     double price;

    public Boxprice() {
        this.price = -1;
    }

    public Boxprice(double price) {
        this.price = price;
    }

    public Boxprice(double l, double w, double h, double weight, double price) {
        super(l, w, h, weight);
        System.out.println("Constructor called of this type Boxprice(l, w, h, weight, price)");
        this.price = price;
        // here we can see multilevel inheritance has occured as constructor boxprice is calling constructor of its parent class i.e Boxweight class & also deriving properties from its super class Box.
    }
}
