package OOPs_Pillars.Inheritance.Hiearchial_Inheritance;

public class Circle extends Shapes {
    double diameter;

    Circle() {
        this.diameter = -1;
    }

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }
}
