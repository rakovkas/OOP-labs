package week4.shape;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, FillType fill, double r){
        super(color, fill);
        this.radius = r;
    }

    public void displayInfo(){
        System.out.println("color: " + this.getColor() + ", " + this.getFill() + ", " + radius);
    }

    private double Area(){
        return this.radius*this.radius*3.14;
    }

    public void getArea(){
        System.out.println(this.Area());
    }

    public double calculateCircumference(double PI){
        return this.radius*2*PI;
    }

    public double calculateCircumference (){
        return 2*3.14*this.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
