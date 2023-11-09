package week5.boxes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MaxWeightBox extends Box{
    private int maxWeight;
    private int currentWeight;
    private List<Thing> box;

    public MaxWeightBox (int maxWeight){
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.box = new ArrayList<Thing>();
    }

    public void add (Thing thing){
        if ((this.currentWeight + thing.getWeight()) <= this.maxWeight){
            box.add(thing);
            this.currentWeight += thing.getWeight();
        }
    }

    public boolean isInTheBox(Thing thing){
        boolean inBox = false;

        for (Thing t : this.box){
            if (t.equals(thing)){
                inBox = true;
                break;
            }
        }

        return inBox;
    }


    //getters and setters

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public List<Thing> getBox() {
        return box;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public void setBox(List<Thing> box) {
        this.box = box;
    }
}
