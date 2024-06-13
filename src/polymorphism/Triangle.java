package polymorphism;

public class Triangle extends GeometricalShape {

    // Triangle sides
    private double sideA = 0;
    private double sideB = 0;
    private double sideC = 0;
    private double height = 0;
    // Area should not be a parameter as it is calculated based on the sides
    private double area = 0;

    @Override
    public double calculatePerimeter(){
        return this.sideA + this.sideB + this.sideC;
    }

    @Override
    public double calculateArea(){
        return ((height * sideB) / 2);
    }

    public double heron(){
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    Triangle(double sideA, double sideB, double sideC, double height){
        // Check for triangle inequality violation
        if (!isValidTriangle(sideA, sideB, sideC)) {
            throw new IllegalArgumentException("Invalid triangle sides. Please ensure sum of any two sides is greater than the third side.");
            System.out.println("Error, Triangle object created with invalid sides. Please ensure sum of any two sides is greater than the third side.");
        }

        this.sideA =  sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    private boolean isValidTriangle(double sideA, double sideB, double sideC) {
        return (sideA + sideB > sideC) && (sideB + sideC > sideA) && (sideC + sideA > sideB);
    }
}