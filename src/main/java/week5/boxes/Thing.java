package week5.boxes;

import java.util.HashMap;
import java.util.Map;

public class Thing {
    private int weight;
    private String name;

    Map<String, Integer> boxMap = new HashMap<String, Integer>();

    public Thing (String name, int weight){
        if (weight < 0){
            throw new IllegalArgumentException("Weight cannot be negative!");
        }
        else {
            this.name = name;
            this.weight=weight;
        }
    }

    public Thing(String name){
        this.name = name;
    }

    public Thing(int weight){
        if (weight<0){
            throw  new IllegalArgumentException("Weight cannot be negative!");
        }
        this.weight = weight;
    }

    public void add (Thing thing){
        boxMap.put(thing.name, thing.weight);
    }

    public boolean isInTheBox (Thing thing){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean equals (Object object){
        boolean isEqual = false;

        if (object != null && object instanceof Thing){
            isEqual = (this.name == ((Thing)object).name);
        }

        return isEqual;
    }



    //getters and setters

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getBoxMap() {
        return boxMap;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBoxMap(Map<String, Integer> boxMap) {
        this.boxMap = boxMap;
    }
}
