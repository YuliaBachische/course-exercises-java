package lections_exercises08;

public abstract class ThreeSides implements Shape {
    double sideA;
    double height;
    public ThreeSides(){

    }
    public ThreeSides(double sideA, double height){
        this.sideA = sideA;
        this.height = height;
    }
    public double areaOfShapeOfTriangle(){
        return (this.sideA*this.height)/2;
    }

}
