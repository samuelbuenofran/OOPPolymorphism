package polymorphism;

public class Triangle extends GeometricalShape {

    private double sideA = 0;
    private double sideB = 0;
    private double sideC = 0;
    private double height = 0;

    @Override
    public double calculatePerimeter(){
        return this.sideA + this.sideB + this.sideC;
    }

    @Override
    public double calculateArea(){
        return ((height * sideB) / 2);
    }

    Triangle(double sideA, double sideB, double sideC, double height){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }
}
