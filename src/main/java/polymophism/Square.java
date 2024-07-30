package polymophism;

public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double a) {
        super(a, a);
    }

    public Square(double a, String color, boolean filled) {
        super(a, a, color, filled);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public String getType() {return "Square";}

    @Override
    public String getSize() {
        return String.format("Size: %s", this.getWidth());
    }
}

