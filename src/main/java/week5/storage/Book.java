package week5.storage;

public class Book implements ToBeStored {
    private String writer;
    private String name;
    private double weight;

    public Book (String writer, String name, double weight){
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    public String toString(){
        return this.getWriter() + ": " + this.getName();
    }

    //getters and setters


    public String getWriter() {
        return writer;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
