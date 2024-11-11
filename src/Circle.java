public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getSquare() {
        double Square = Math.PI * (radius * radius);
        return Square;
    }

}
