package ss6_Inheritance.thuc_hanh;

public class Square extends Rectangle {
    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public double getSide() {
        return getWidth();
    }


    @Override
    public String toString() {
        return "A Square with side=" + getSide() + "which is a subclass of " + super.toString();
    }
}
