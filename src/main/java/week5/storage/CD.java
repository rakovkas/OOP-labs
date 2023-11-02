package week5.storage;

public class CD implements ToBeStored{
    private String artist;
    private String title;
    private int publishingYear;
    private double weight;

    public CD(String artist, String title, int publishingYear){
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
    }

    @Override
    public double weight() {
        return 0.1;
    }

    public String toString(){
        return this.getArtist() + ": " + this.getTitle() + " (" + this.getPublishingYear() + ")";
    }


    //getters and setters

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public double getWeight() {
        return weight;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
