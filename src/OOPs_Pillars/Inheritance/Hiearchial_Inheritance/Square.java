package OOPs_Pillars.Inheritance.Hiearchial_Inheritance;

public class Square extends Shapes {
    double angle;

    Square() {
        this.angle = 90;
    }

    public Square(double angle) {
        this.angle = angle;
    }

    public Square(double side, double angle) {
        super(side);
        this.angle = angle;
    }
}