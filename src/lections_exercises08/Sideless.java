package lections_exercises08;

public abstract class Sideless implements Shape {
    double radius;
    final double PI = 3.14;
    public Sideless(){

    }
    public Sideless(double radius){
        this.radius=radius;
    }
    public double areaOfShapeOfSideless(){
        return radius*PI;
    }

}
