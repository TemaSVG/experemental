public class Rectangle {
    double width;
    double length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public double getSquare() {
        double square = (double) (width * length) / 2;
        return square;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
