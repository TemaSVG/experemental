public class Rectangle {
    int width;
    int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public double getSquare() {
        double square = (double) (width * length) / 2;
        return square;
    }
}
