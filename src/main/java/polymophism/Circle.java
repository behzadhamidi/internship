package polymophism;

public class Circle extends Shape {

    private double radius;

    public Circle() {
        this(0);
    }

    public Circle(double r) {
        super();
        this.radius = r;
    }

    public Circle(double r, String color, boolean filled) {
        super(color, filled);
        this.radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    @Override
    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public String getType() {return "Circle";}

    @Override
    public String getSize() {
        return String.format("Radius: %s", this.getRadius());
    }


}
