package polymorphism;

public class Rectangle extends GeometricalShape{

    private double length = 0;
    private double width = 0;
    private double area = 0;
    private double perimeter = 0;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return this.length * this.width;
    }

    public double calculatePerimeter(){
        return 2 * (this.length + this.width);
    }
}
