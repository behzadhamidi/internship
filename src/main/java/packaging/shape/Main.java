
package packaging.shape;

import packaging.shape.circles.Circle;
import packaging.shape.rectangle.Rectangle;
import packaging.shape.rectangle.Square;
import packaging.shape.triangles.Triangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0,3.0);
        Circle circle = new Circle(5.0);
        Square square = new Square(5.0);
        Triangle triangle = new Triangle(6.0, 3.0);

        System.out.println("Area od rectangle:"+rectangle.getArea());
        System.out.println("Area of the circle: " + circle.getArea());
        System.out.println("Area of the square: " + square.getArea());
        System.out.println("Perimeter of the square: " + square.getPerimeter());
        System.out.println("Area of the triangle: " + triangle.getArea());
    }
}
