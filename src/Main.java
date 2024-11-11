public class Main {
    public static void main(String[] args) {
        int[] radiusCircle = {1, 10, 27, 36};
        for (int i = 0; i < radiusCircle.length; i++) {
            Circle squareCircle = new Circle(radiusCircle[i]);
            System.out.printf("Площадь круга с радиусом %s = %f\n", radiusCircle[i], squareCircle.getSquare());
        }
        int[] width = {10, 1, 10, 15};
        int[] length = {20, 5, 10, 105};
        for (int i = 0; i < width.length; i++) {
            Rectangle squareRectangle = new Rectangle(width[i], length[i]);
            System.out.printf("Площадь прямоугольника с шириной %s и длинной %s = %.2f\n", width[i], length[i], squareRectangle.getSquare());
        }
    }
}