package lections_exercises08;

public class ShapeUtils implements Shape{
    static boolean isRectangle(Shape shape){
        return shape instanceof Shape.Rectangle;
    }
    static boolean isTriangle(Shape shape){
        return shape instanceof Shape.Triangle;
    }
}
