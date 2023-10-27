package week4.shape;

public class Shape {
    private String color;
    private FillType fill;

    public Shape (String color, FillType fill){
        this.color = color;
        this.fill = fill;
    }

    public void displayInfo (){
        System.out.println("color: " + this.color + ", " + this.fill);
    }

    public void getArea(){
    }

    public String getColor() {
        return color;
    }

    public FillType getFill() {
        return fill;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFill(FillType fill) {
        this.fill = fill;
    }
}
