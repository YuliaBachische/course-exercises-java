package lections_exercises08;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Test {

    private static Logger LOGGER = Logger.getLogger(Test.class);
    public static void main(String[] args) {
        LOGGER.error("Test");
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите фигуру, над которой будут происходить действия: " + "\n" + "1.Квадрат" +
                "\n" + "2.Прямоугольник" + "\n" + "3.Круг" + "\n" + "4.Эллипс " + "\n" + "5.yaml.Треугольник");
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("Введите сторону квадрата(см): ");
                int squareSide = sc.nextInt();
                Shape.Square square = new Shape.Square(squareSide);
                System.out.println("Площадь квадрата: " + square.areaOfShapeOfQuadrangle());
                break;
            case 2:
                System.out.println("Введите длину первой стороны прямоугольника: ");
                int rectangleSide1 = sc.nextInt();
                System.out.println("Введите длину второй стороны прямоугольника: ");
                int rectangleSide2 = sc.nextInt();
                Shape.Rectangle rectangle = new Shape.Rectangle(rectangleSide1, rectangleSide2);
                if(ShapeUtils.isRectangle(rectangle)) {
                    System.out.println("Какое действие хотите провести: " + "\n" + "1. Вычислить площадь" + "\n" +
                            "2. Вычислить диагональ" + "\n" + "3. Вычислить площадь и диагональ");
                    int chooseActionRect = sc.nextInt();
                switch (chooseActionRect) {
                    case 1:
                        System.out.println("Площадь прямоугольника: " + rectangle.areaOfShapeOfQuadrangle());
                        break;
                    case 2:
                        System.out.println("Диагональ прямоугольника: " + rectangle.rectagleDiagonal());
                        break;
                    case 3:
                        System.out.println("Площадь прямоугольника: " + rectangle.areaOfShapeOfQuadrangle() + "\n" +
                                "Диагональ прямоугольника: " + rectangle.rectagleDiagonal());
                        break;
                }
                }
                break;
            case 3:
                System.out.println("Введите радиус: ");
                int circleRadius = sc.nextInt();
                Shape.Circle circle = new Shape.Circle(circleRadius);
                System.out.println("Площадь круга: " + circle.areaOfShapeOfSideless());
                break;
            case 4:
                System.out.println("Введите большую ось эллипса: ");
                int bigAxis = sc.nextInt();
                System.out.println("Введите малую ось эллипса: ");
                int smallAxis = sc.nextInt();
                Shape.Ellipse ellipse = new Shape.Ellipse(bigAxis, smallAxis);
                System.out.println(ellipse.areaOfShapeOfSideless());
                break;
            case 5:
                System.out.println("Введите высоту треугольника: ");
                double triangleHeight= sc.nextDouble();
                System.out.println("Введите длину стороны треугольника: ");
                double triangleSide = sc.nextDouble();
                Shape.Triangle triangle = new Shape.Triangle(triangleSide, triangleHeight);
                if(ShapeUtils.isTriangle(triangle)) {
                    System.out.println("Площадь треугольника: " + triangle.areaOfShapeOfTriangle());
                    break;
                }
        }
    }
}
