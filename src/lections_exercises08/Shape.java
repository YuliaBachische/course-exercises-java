package lections_exercises08;

import static java.lang.Math.sqrt;

public interface Shape {
    class Rectangle extends Quadrangle{
        public Rectangle(double sideA, double sideB) {
            super(sideA, sideB);
        }
        @Override
        public double areaOfShapeOfQuadrangle() {
            return areaOfShapeOfQuadrangle();
        }
        public double rectagleDiagonal(){
            return sqrt((sideA*sideA)+(sideB*sideB));
        }

        @Override
        public String toString() {
            return "Rectangle{sideA=" + sideA + ", sideB =" + sideB + "}";
        }
    }
    class Circle extends Sideless{
        public Circle(double radius) {
            super(radius);
        }

        @Override
        public String toString() {
            return "Circle{radius=" + radius + ", PI =" + PI + "}";
        }
    }
        class Ellipse extends Sideless{
        double sideA;
        double sideB;
        public Ellipse(double sideA, double sideB){
            this.sideA = sideA/2;
            this.sideB = sideB/2;
        }
        @Override
        public double areaOfShapeOfSideless() {
            return sideA*sideB*PI;
        }

        @Override
        public String toString() {
            return "Ellipse{" +
                    "sideA=" + this.sideA +
                    ", sideB=" + this.sideB +
                    '}';
        }
    }
    class Triangle extends ThreeSides{

        public Triangle(double sideA, double height) {
            super(sideA, height);
        }


        @Override
        public String toString() {
            return "Triangle{" +
                    "sideA=" + sideA +
                    ", height=" + height +
                    '}';
        }
    }
    class Square extends Quadrangle{

        public Square(double sideA) {
            super.sideA = sideA;
        }

        @Override
        public String toString() {
            return "Square{" +
                    "sideA=" + sideA +
                    "}";
        }
    }
}
