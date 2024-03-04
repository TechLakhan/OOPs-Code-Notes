package OOPs_Pillars.Inheritance.SingleInheritance;

public class Box {
    double l;
    double w;
    double h;

//    double weight;

    Box () {
        super();
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

//    cube
    Box (double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box (Box old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
}
