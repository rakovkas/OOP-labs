package week6.nightSky;

import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private  int height;
    private int starsInLastPrint = 0;

    Random random = new Random();

    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height){
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }

    public NightSky (double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine(){
        int i = 0;
        while (i<this.width){
            double randomValue = random.nextDouble();
            if (randomValue <= this.density) {
                System.out.print("*");
                starsInLastPrint ++;
            }
            else
                System.out.print(" ");
            i++;
        }
    }

    public int starsInLastPrint(){
        int stars = this.getStarsInLastPrint();
        this.setStarsInLastPrint(0);
        return stars;
    }

    //getters and setters

    public double getDensity() {
        return density;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getStarsInLastPrint() {
        return starsInLastPrint;
    }

    public void setStarsInLastPrint(int starsInLastPrint) {
        this.starsInLastPrint = starsInLastPrint;
    }
}
