package polymophism;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(20, 30, "blue", false);
        shapes[1] = new Circle(14, "orange", false);
        shapes[2] = new Square(40, "pink", true);

        for(Shape shape:shapes) {
            System.out.format("%s\n", shape);
            System.out.format("Area = %s, Perimeter = %s\n\n", shape.getArea(), shape.getPerimeter());
        }

    }
}