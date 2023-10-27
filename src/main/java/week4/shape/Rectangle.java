package week4.shape;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle (String color, FillType fill, double w, double h){
        super(color, fill);
        this.height = h;
        this.width = w;
    }

    private double Area(){
        return this.width*this.height;
    }

    public void getArea(){
        System.out.println(this.Area());
    }
    public void displayInfo(){
        System.out.println("color: " + this.getColor() + ", " + this.getFill()
                + ", width: " + width + ", height: " + height
                + ", area: " + Area());
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
