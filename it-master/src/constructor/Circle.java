package constructor;

public class Circle {
    double radius;
    String color;
    boolean isTransparent = false;

    public Circle(double radius ,String color, boolean isTransparent ) {
        this.radius = radius;
        this.color = color;
        this.isTransparent = isTransparent;

    }
    public void setRadius( double radius) {
        this.radius = radius;
    }
    public void setColor( String color) {
        this.color = color;
    }
    public void setTransparent ( boolean isTransparent) {
        this.isTransparent = isTransparent;
    }
}
