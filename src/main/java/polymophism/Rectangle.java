package polymophism;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle() {
        this(0, 0);
    }

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {return this.width;}
    public void setWidth(double width) {this.width = width;}

    public double getHeight() {return this.height;}
    public void setHeight(double height) {this.height = height;}

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+height);
    }

    @Override
    public String getType() {return "Rectangle";}

    @Override
    public String getSize() {
        return String.format("Size: %s x %s", this.getWidth(), this.getHeight());
    }

}
