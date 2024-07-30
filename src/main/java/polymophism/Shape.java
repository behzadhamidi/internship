package polymophism;
public abstract class Shape {

    private String color;
    private boolean filled;

    public Shape() {
        this("", false);
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {return this.color;}
    public void setColor(String color) {this.color = color;}

    public boolean getFilled() {return this.filled;}
    public void setFilled(boolean filled) {this.filled = filled;}

    @Override
    public final String toString() {
        return this.getType() + " [" + this.getSize() + ", Color: " + this.getColor() + ", Filled: " + this.getFilled() + "]";
    }

    public String getType() {return "Shape";}

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String getSize();

}