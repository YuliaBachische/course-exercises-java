package lections_exercises08;

public abstract class Quadrangle implements Shape{
    double sideA;
    double sideB;

    public Quadrangle() {
    }

    public Quadrangle( double sideA,  double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public  double areaOfShapeOfQuadrangle(){
        return this.sideA * this.sideB;
    }
}
