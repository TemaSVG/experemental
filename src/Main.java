import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {
        Circle[] arrayCircle = {new Circle(1), new Circle(10), new Circle(27), new Circle(36)};
        for (int i = 0; i < arrayCircle.length; i++) {
            System.out.printf("Площадь круга с радиусом %s = %f\n", arrayCircle[i].getRadius(), arrayCircle[i].getSquare());
        }
        Rectangle[] arrayRectangle = {new Rectangle(10, 20), new Rectangle(1, 5), new Rectangle(10, 10), new Rectangle(15, 105)};
        for (int i = 0; i < arrayRectangle.length; i++) {
            System.out.printf("Площадь прямоугольника с шириной %s и длинной %s = %.2f\n", arrayRectangle[i].getWidth(), arrayRectangle[i].getLength(), arrayRectangle[i].getSquare());
        }



    }
}