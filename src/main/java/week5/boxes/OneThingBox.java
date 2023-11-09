package week5.boxes;

import java.util.ArrayList;
import java.util.List;

public class OneThingBox extends Box{

    private int numOfThings;
    private List<Thing> box;
    public OneThingBox(){
        this.numOfThings = 0;
        this.box = new ArrayList<Thing>();
    }

    public void add(Thing thing){
        if (this.numOfThings != 1){
            box.add(thing);
            numOfThings = 1;
        }
    }

    public boolean isInTheBox (Thing thing){
        boolean inBox = false;

        for (Thing t : box){
            if (t.equals(thing)){
                inBox = true;
                break;
            }
        }
        return inBox;
    }


    //getters and setters


    public int getNumOfThings() {
        return numOfThings;
    }

    public List<Thing> getBox() {
        return box;
    }

    public void setNumOfThings(int numOfThings) {
        this.numOfThings = numOfThings;
    }

    public void setBox(List<Thing> box) {
        this.box = box;
    }
}
