package lections_exercises08;

public class ShapeUtils {
    static boolean isRectangle(Shape shape){
        return shape instanceof Shape.Rectangle;
    }
    static boolean isTriangle(Shape shape){
        return shape instanceof Shape.Triangle;
    }
}
