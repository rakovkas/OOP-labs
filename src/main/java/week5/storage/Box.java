package week5.storage;

import java.util.ArrayList;

public class Box {

    private double maxWeight;
    private double currentWeight;
    private int numOfThings;

    public Box (double maxWeight){
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.numOfThings  = 0;
    }

    public void add(ToBeStored object){
        if((this.currentWeight + object.weight()) <= this.maxWeight){
            this.currentWeight += object.weight();
            this.numOfThings ++;
        }
    }

    public String toString(){
        return "Box: " + this.numOfThings
                + " things, total weight " + this.currentWeight + " kg";
    }


    //getters and setters


    public double getMaxWeight() {
        return maxWeight;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public int getNumOfThings() {
        return numOfThings;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void setCurrentWeight(double currentWeight) {
        this.currentWeight = currentWeight;
    }

    public void setNumOfThings(int numOfThings) {
        this.numOfThings = numOfThings;
    }
}
